declare function local:getOrderContainer($r as element(), $orderContainer as element(), $namespace as xs:string)
as element()*
{
  let $element := $orderContainer/*/xs:element   
  
  let $nested :=
  (for $nestedOrderContainer in $orderContainer/*[./*[name() = "xs:sequence" or name() = "xs:choice" or name() = "xs:all" or name() ="xs:group"]]
   return local:getOrderContainer($r, $nestedOrderContainer, $namespace))
  
  let $group :=
  (for $groupRef in $orderContainer/xs:group
   for $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)]
   return local:getOrderContainer($r, $group, $namespace))   
      
  for $result in (($element, $nested, $group))
  return $result   
};

declare function local:getChildrenComplexType($r as element(), $complexType as element(), $namespace as xs:string)
as element()*
{
  if($complexType/xs:sequence or $complexType/xs:choice or $complexType/xs:all) then
    for $c in $complexType
    return local:getOrderContainer($r, $complexType, $namespace)
  else
  
    let $groupResult :=
    (for $groupRef in $complexType/xs:group
     for $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)]
     return local:getOrderContainer($r, $group, $namespace))
    
    let $extensionResult1 :=
    (for $extension in $complexType/xs:complexContent/xs:extension 
     return local:getOrderContainer($r, $extension, $namespace))
    
    let $extensionResult2 :=
      (for $extension in $complexType/xs:complexContent/xs:extension
       for $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)]
       return local:getChildrenComplexType($r, $extensionComplexType, $namespace))    
    
    let $restrictionResult :=
    (for $restriction in $complexType/xs:complexContent/xs:restriction 
     return local:getOrderContainer($r, $restriction, $namespace))
    
    for $result in (($groupResult, $extensionResult1, $extensionResult2, $restrictionResult))
    return $result  
};

declare function local:getChildren($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
for $e1 in $r//xs:element[@name=$n1]
return
  if($e1[@type]) then
    for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)] 
    return local:getChildrenComplexType($r, $externalComplexType, $namespace)      
  else
    for $internalComplexType in $e1/xs:complexType
    return local:getChildrenComplexType($r, $internalComplexType, $namespace)  
};

declare function local:getOrderContainerDescendant($r as element(), $orderContainer as element(), $namespace as xs:string)
as element()*
{
  let $nameOrRef :=
  (for $child in $orderContainer/*/xs:element       
   return 
     if (exists($child/@name)) then local:getDescendants($r,$child/@name, $namespace)
     else local:getDescendants($r,substring-after($child/@ref, $namespace), $namespace))
  
  let $nested := 
  (for $nestedOrderContainer in $orderContainer/*[./*[name() = "xs:sequence" or name() = "xs:choice" or name() = "xs:all" or name() ="xs:group"]]
   return local:getOrderContainerDescendant($r, $nestedOrderContainer,$namespace))
  
  let $group :=
  (for $groupRef in $orderContainer/xs:group
   for $group in $r/xs:group[@name = substring-after($groupRef/@ref, $namespace)]        
   return local:getOrderContainerDescendant($r, $group, $namespace))
   
  for $result in (($nameOrRef, $nested, $group))
  return $result             
};

declare function local:getDescendantsComplexType($r as element(), $complexType as element(), $namespace as xs:string)
as element()*
{
  if($complexType/xs:sequence or $complexType/xs:choice or $complexType/xs:all) then
     for $c in $complexType
     return local:getOrderContainerDescendant($r, $complexType, $namespace)  
  else
    
    let $group :=
    (for $groupRef in $complexType/xs:group
     for $group in $r//xs:group[@name = substring-after($groupRef/@ref, $namespace)]
     return local:getOrderContainerDescendant($r, $group, $namespace))
  
    let $extension1 :=
    (for $extension in $complexType/xs:complexContent/xs:extension       
     return local:getOrderContainerDescendant($r, $extension, $namespace))
    
    let $extension2 :=        
      (for $extension in $complexType/xs:complexContent/xs:extension
       for $extensionComplexType in $r/xs:complexType[@name = substring-after($extension/@base, $namespace)]
       return local:getDescendantsComplexType($r, $extensionComplexType, $namespace))
    
    let $restriction :=
    (for $restriction in $complexType/xs:complexContent/xs:restriction 
     return local:getOrderContainerDescendant($r, $restriction, $namespace))
    
    for $result in (($group, $extension1, $extension2, $restriction))
    return $result             
};

declare function local:getDescendants($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{ 
  let $children := 
  (local:getChildren($r, $n1, $namespace))
  
  let $nonChildren :=
  (for $e1 in $r//xs:element[@name=$n1]    
   return if($e1[@type]) then       
      for $externalComplexType in $r/xs:complexType[@name = substring-after($e1/@type, $namespace)]           
      return local:getDescendantsComplexType($r, $externalComplexType,$namespace)            
    else      
      for $internalComplexType in $e1/xs:complexType
      return local:getDescendantsComplexType($r, $internalComplexType,$namespace))
      
   for $result in (($children, $nonChildren))
   return $result             
};