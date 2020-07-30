
declare function local:getParentsComplexType($r as element(), $complexType as element(), $namespace as xs:string)
as element()*
{
  if($complexType[@name]) then
    $r//xs:element[@type = $namespace || $complexType/@name]    
  else
    $complexType/parent::xs:element 
};

declare function local:getParentsGroup($r as element(), $group as element(), $namespace as xs:string)
as element()*
{
   if($group[@name]) then
     for $groupRef in $r//xs:group[@ref = $namespace || $group/@name]
     return local:getParentsIndicator($r, $groupRef, $namespace)
   else if ($group[@ref]) then
     local:getParentsIndicator($r, $group, $namespace)
};

declare function local:getParentsExtension($r as element(), $extension as element(), $namespace as xs:string)
as element()*
{
  if (exists($extension/parent::xs:complexContent/parent::xs:complexType)) then
    local:getParentsComplexType($r, $extension/parent::*/parent::*, $namespace) 
};

declare function local:getParentsIndicator($r as element(), $indicator as element(), $namespace as xs:string)
as element()*
{
  if (exists($indicator/parent::xs:complexType)) then
    local:getParentsComplexType($r, $indicator/parent::*, $namespace)
  else if(exists($indicator/parent::xs:sequence) or exists($indicator/parent::xs:choice) or exists($indicator/parent::xs:all)) then
    local:getParentsIndicator($r, $indicator/parent::*, $namespace)
  else if (exists($indicator/parent::xs:group)) then 
    local:getParentsGroup($r, $indicator/parent::*, $namespace)
  else if (exists($indicator/parent::xs:extension)) then 
    local:getParentsExtension($r, $indicator/parent::*, $namespace)  
};

declare function local:getParents($r as element(), $n1 as xs:string, $namespace as xs:string)
as element()*
{
for $e1 in $r//xs:element[@name=$n1 or @ref=$n1]
return
  if(exists($e1/parent::xs:sequence) or exists($e1/parent::xs:choice) or exists($e1/parent::xs:all)) then
    local:getParentsIndicator($r, $e1/parent::*, $namespace)
};
