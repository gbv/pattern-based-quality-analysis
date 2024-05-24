/**
 */
package qualitypatternmodel.javaquery.provider;

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

import qualitypatternmodel.javaquery.util.JavaqueryAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaqueryItemProviderAdapterFactory extends JavaqueryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public JavaqueryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.JavaFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFilterItemProvider javaFilterItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.JavaFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaFilterAdapter() {
		if (javaFilterItemProvider == null) {
			javaFilterItemProvider = new JavaFilterItemProvider(this);
		}

		return javaFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.FormulaFilterPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaFilterPartItemProvider formulaFilterPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.FormulaFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormulaFilterPartAdapter() {
		if (formulaFilterPartItemProvider == null) {
			formulaFilterPartItemProvider = new FormulaFilterPartItemProvider(this);
		}

		return formulaFilterPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.BooleanFilterElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanFilterElementItemProvider booleanFilterElementItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.BooleanFilterElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanFilterElementAdapter() {
		if (booleanFilterElementItemProvider == null) {
			booleanFilterElementItemProvider = new BooleanFilterElementItemProvider(this);
		}

		return booleanFilterElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneArgFunctionFilterPartItemProvider oneArgFunctionFilterPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOneArgFunctionFilterPartAdapter() {
		if (oneArgFunctionFilterPartItemProvider == null) {
			oneArgFunctionFilterPartItemProvider = new OneArgFunctionFilterPartItemProvider(this);
		}

		return oneArgFunctionFilterPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.ListFilterPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFilterPartItemProvider listFilterPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.ListFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListFilterPartAdapter() {
		if (listFilterPartItemProvider == null) {
			listFilterPartItemProvider = new ListFilterPartItemProvider(this);
		}

		return listFilterPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.NotFilterPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotFilterPartItemProvider notFilterPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.NotFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotFilterPartAdapter() {
		if (notFilterPartItemProvider == null) {
			notFilterPartItemProvider = new NotFilterPartItemProvider(this);
		}

		return notFilterPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.CountFilterPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountFilterPartItemProvider countFilterPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.CountFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCountFilterPartAdapter() {
		if (countFilterPartItemProvider == null) {
			countFilterPartItemProvider = new CountFilterPartItemProvider(this);
		}

		return countFilterPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.CountFilterElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountFilterElementItemProvider countFilterElementItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.CountFilterElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCountFilterElementAdapter() {
		if (countFilterElementItemProvider == null) {
			countFilterElementItemProvider = new CountFilterElementItemProvider(this);
		}

		return countFilterElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.NumberFilterElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberFilterElementItemProvider numberFilterElementItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.NumberFilterElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberFilterElementAdapter() {
		if (numberFilterElementItemProvider == null) {
			numberFilterElementItemProvider = new NumberFilterElementItemProvider(this);
		}

		return numberFilterElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.NumberValueFilterElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberValueFilterElementItemProvider numberValueFilterElementItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.NumberValueFilterElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberValueFilterElementAdapter() {
		if (numberValueFilterElementItemProvider == null) {
			numberValueFilterElementItemProvider = new NumberValueFilterElementItemProvider(this);
		}

		return numberValueFilterElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qualitypatternmodel.javaquery.QuantifierFilterPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifierFilterPartItemProvider quantifierFilterPartItemProvider;

	/**
	 * This creates an adapter for a {@link qualitypatternmodel.javaquery.QuantifierFilterPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantifierFilterPartAdapter() {
		if (quantifierFilterPartItemProvider == null) {
			quantifierFilterPartItemProvider = new QuantifierFilterPartItemProvider(this);
		}

		return quantifierFilterPartItemProvider;
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
		if (javaFilterItemProvider != null) javaFilterItemProvider.dispose();
		if (formulaFilterPartItemProvider != null) formulaFilterPartItemProvider.dispose();
		if (booleanFilterElementItemProvider != null) booleanFilterElementItemProvider.dispose();
		if (oneArgFunctionFilterPartItemProvider != null) oneArgFunctionFilterPartItemProvider.dispose();
		if (listFilterPartItemProvider != null) listFilterPartItemProvider.dispose();
		if (notFilterPartItemProvider != null) notFilterPartItemProvider.dispose();
		if (countFilterPartItemProvider != null) countFilterPartItemProvider.dispose();
		if (countFilterElementItemProvider != null) countFilterElementItemProvider.dispose();
		if (numberFilterElementItemProvider != null) numberFilterElementItemProvider.dispose();
		if (numberValueFilterElementItemProvider != null) numberValueFilterElementItemProvider.dispose();
		if (quantifierFilterPartItemProvider != null) quantifierFilterPartItemProvider.dispose();
	}

}
