/**
 */
package qualitypatternmodel.parameters.provider;

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
import qualitypatternmodel.parameters.util.ParametersAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersItemProviderAdapterFactory extends ParametersAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ParametersItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.ComparisonOptionParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonOptionParamItemProvider comparisonOptionParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.ComparisonOptionParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonOptionParamAdapter() {
		if (comparisonOptionParamItemProvider == null) {
			comparisonOptionParamItemProvider = new ComparisonOptionParamItemProvider(this);
		}

		return comparisonOptionParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.ParameterList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterListItemProvider parameterListItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.ParameterList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterListAdapter() {
		if (parameterListItemProvider == null) {
			parameterListItemProvider = new ParameterListItemProvider(this);
		}

		return parameterListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.BooleanParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanParamItemProvider booleanParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.BooleanParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanParamAdapter() {
		if (booleanParamItemProvider == null) {
			booleanParamItemProvider = new BooleanParamItemProvider(this);
		}

		return booleanParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.TextListParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextListParamItemProvider textListParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.TextListParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextListParamAdapter() {
		if (textListParamItemProvider == null) {
			textListParamItemProvider = new TextListParamItemProvider(this);
		}

		return textListParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.TextLiteralParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextLiteralParamItemProvider textLiteralParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.TextLiteralParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextLiteralParamAdapter() {
		if (textLiteralParamItemProvider == null) {
			textLiteralParamItemProvider = new TextLiteralParamItemProvider(this);
		}

		return textLiteralParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.NumberParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberParamItemProvider numberParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.NumberParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberParamAdapter() {
		if (numberParamItemProvider == null) {
			numberParamItemProvider = new NumberParamItemProvider(this);
		}

		return numberParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.DateParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateParamItemProvider dateParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.DateParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateParamAdapter() {
		if (dateParamItemProvider == null) {
			dateParamItemProvider = new DateParamItemProvider(this);
		}

		return dateParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.TimeParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeParamItemProvider timeParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.TimeParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeParamAdapter() {
		if (timeParamItemProvider == null) {
			timeParamItemProvider = new TimeParamItemProvider(this);
		}

		return timeParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.UntypedParameterValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UntypedParameterValueItemProvider untypedParameterValueItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.UntypedParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUntypedParameterValueAdapter() {
		if (untypedParameterValueItemProvider == null) {
			untypedParameterValueItemProvider = new UntypedParameterValueItemProvider(this);
		}

		return untypedParameterValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.DateTimeParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeParamItemProvider dateTimeParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.DateTimeParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateTimeParamAdapter() {
		if (dateTimeParamItemProvider == null) {
			dateTimeParamItemProvider = new DateTimeParamItemProvider(this);
		}

		return dateTimeParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.TypeOptionParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOptionParamItemProvider typeOptionParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.TypeOptionParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeOptionParamAdapter() {
		if (typeOptionParamItemProvider == null) {
			typeOptionParamItemProvider = new TypeOptionParamItemProvider(this);
		}

		return typeOptionParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.KeyValueParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValueParamItemProvider keyValueParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.KeyValueParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeyValueParamAdapter() {
		if (keyValueParamItemProvider == null) {
			keyValueParamItemProvider = new KeyValueParamItemProvider(this);
		}

		return keyValueParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.parameters.MultiListParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiListParamItemProvider multiListParamItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.parameters.MultiListParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiListParamAdapter() {
		if (multiListParamItemProvider == null) {
			multiListParamItemProvider = new MultiListParamItemProvider(this);
		}

		return multiListParamItemProvider;
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
		if (comparisonOptionParamItemProvider != null) comparisonOptionParamItemProvider.dispose();
		if (parameterListItemProvider != null) parameterListItemProvider.dispose();
		if (booleanParamItemProvider != null) booleanParamItemProvider.dispose();
		if (textListParamItemProvider != null) textListParamItemProvider.dispose();
		if (textLiteralParamItemProvider != null) textLiteralParamItemProvider.dispose();
		if (numberParamItemProvider != null) numberParamItemProvider.dispose();
		if (dateParamItemProvider != null) dateParamItemProvider.dispose();
		if (timeParamItemProvider != null) timeParamItemProvider.dispose();
		if (untypedParameterValueItemProvider != null) untypedParameterValueItemProvider.dispose();
		if (dateTimeParamItemProvider != null) dateTimeParamItemProvider.dispose();
		if (typeOptionParamItemProvider != null) typeOptionParamItemProvider.dispose();
		if (keyValueParamItemProvider != null) keyValueParamItemProvider.dispose();
		if (multiListParamItemProvider != null) multiListParamItemProvider.dispose();
	}

}
