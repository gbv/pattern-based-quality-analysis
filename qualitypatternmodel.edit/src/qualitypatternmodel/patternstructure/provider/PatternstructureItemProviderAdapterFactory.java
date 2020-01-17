/**
 */
package qualitypatternmodel.patternstructure.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import qualitypatternmodel.patternstructure.util.PatternstructureAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternstructureItemProviderAdapterFactory extends PatternstructureAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructureItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.RelationMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationMappingItemProvider relationMappingItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.RelationMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationMappingAdapter() {
		if (relationMappingItemProvider == null) {
			relationMappingItemProvider = new RelationMappingItemProvider(this);
		}

		return relationMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.QuantifiedCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifiedConditionItemProvider quantifiedConditionItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.QuantifiedCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantifiedConditionAdapter() {
		if (quantifiedConditionItemProvider == null) {
			quantifiedConditionItemProvider = new QuantifiedConditionItemProvider(this);
		}

		return quantifiedConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.Morphism} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MorphismItemProvider morphismItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.Morphism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMorphismAdapter() {
		if (morphismItemProvider == null) {
			morphismItemProvider = new MorphismItemProvider(this);
		}

		return morphismItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.SingleElementMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleElementMappingItemProvider singleElementMappingItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.SingleElementMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleElementMappingAdapter() {
		if (singleElementMappingItemProvider == null) {
			singleElementMappingItemProvider = new SingleElementMappingItemProvider(this);
		}

		return singleElementMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.Formula} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaItemProvider formulaItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.Formula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormulaAdapter() {
		if (formulaItemProvider == null) {
			formulaItemProvider = new FormulaItemProvider(this);
		}

		return formulaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.True} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueItemProvider trueItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.True}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrueAdapter() {
		if (trueItemProvider == null) {
			trueItemProvider = new TrueItemProvider(this);
		}

		return trueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.Pattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternItemProvider patternItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.Pattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatternAdapter() {
		if (patternItemProvider == null) {
			patternItemProvider = new PatternItemProvider(this);
		}

		return patternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.patternstructure.VariableList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableListItemProvider variableListItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.patternstructure.VariableList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableListAdapter() {
		if (variableListItemProvider == null) {
			variableListItemProvider = new VariableListItemProvider(this);
		}

		return variableListItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (relationMappingItemProvider != null) relationMappingItemProvider.dispose();
		if (quantifiedConditionItemProvider != null) quantifiedConditionItemProvider.dispose();
		if (morphismItemProvider != null) morphismItemProvider.dispose();
		if (singleElementMappingItemProvider != null) singleElementMappingItemProvider.dispose();
		if (formulaItemProvider != null) formulaItemProvider.dispose();
		if (trueItemProvider != null) trueItemProvider.dispose();
		if (patternItemProvider != null) patternItemProvider.dispose();
		if (variableListItemProvider != null) variableListItemProvider.dispose();
	}

}
