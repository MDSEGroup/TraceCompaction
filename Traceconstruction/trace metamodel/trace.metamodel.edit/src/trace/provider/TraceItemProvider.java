/**
 */
package trace.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import trace.Trace;
import trace.TraceFactory;
import trace.TracePackage;

/**
 * This is the item provider adapter for a {@link trace.Trace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TracePackage.Literals.TRACE__STATE);
			childrenFeatures.add(TracePackage.Literals.TRACE__TRANSIENTOBJECT);
			childrenFeatures.add(TracePackage.Literals.TRACE__STEPTYPE);
			childrenFeatures.add(TracePackage.Literals.TRACE__STEPPATTERN);
			childrenFeatures.add(TracePackage.Literals.TRACE__VALUE);
			childrenFeatures.add(TracePackage.Literals.TRACE__OBJECTSTATE);
			childrenFeatures.add(TracePackage.Literals.TRACE__REPEATINGSTEP);
			childrenFeatures.add(TracePackage.Literals.TRACE__STEP);
			childrenFeatures.add(TracePackage.Literals.TRACE__PARAMETER_VALUES);
			childrenFeatures.add(TracePackage.Literals.TRACE__PARAMETERLIST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Trace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Trace"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Trace_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Trace.class)) {
			case TracePackage.TRACE__STATE:
			case TracePackage.TRACE__TRANSIENTOBJECT:
			case TracePackage.TRACE__STEPTYPE:
			case TracePackage.TRACE__STEPPATTERN:
			case TracePackage.TRACE__VALUE:
			case TracePackage.TRACE__OBJECTSTATE:
			case TracePackage.TRACE__REPEATINGSTEP:
			case TracePackage.TRACE__STEP:
			case TracePackage.TRACE__PARAMETER_VALUES:
			case TracePackage.TRACE__PARAMETERLIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__STATE,
				 TraceFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__TRANSIENTOBJECT,
				 TraceFactory.eINSTANCE.createStaticTransientObject()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__TRANSIENTOBJECT,
				 TraceFactory.eINSTANCE.createDynamicTransientObject()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__STEPTYPE,
				 TraceFactory.eINSTANCE.createStepType()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__STEPPATTERN,
				 TraceFactory.eINSTANCE.createStepPattern()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__VALUE,
				 TraceFactory.eINSTANCE.createRefValue()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__VALUE,
				 TraceFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__VALUE,
				 TraceFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__VALUE,
				 TraceFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__VALUE,
				 TraceFactory.eINSTANCE.createLiteralFloat()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__OBJECTSTATE,
				 TraceFactory.eINSTANCE.createLeafObjectState()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__OBJECTSTATE,
				 TraceFactory.eINSTANCE.createCompositeObjectState()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__REPEATINGSTEP,
				 TraceFactory.eINSTANCE.createRepeatingStep()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__STEP,
				 TraceFactory.eINSTANCE.createNormalStep()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__STEP,
				 TraceFactory.eINSTANCE.createPatternOcurrence()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__PARAMETER_VALUES,
				 TraceFactory.eINSTANCE.createParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__PARAMETERLIST,
				 TraceFactory.eINSTANCE.createCompositParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(TracePackage.Literals.TRACE__PARAMETERLIST,
				 TraceFactory.eINSTANCE.createLeafParameterList()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CompactTracemetamodelEditPlugin.INSTANCE;
	}

}
