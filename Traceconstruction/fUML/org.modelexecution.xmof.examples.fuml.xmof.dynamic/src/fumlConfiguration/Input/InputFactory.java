/**
 */
package fumlConfiguration.Input;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.Input.InputPackage
 * @generated
 */
public interface InputFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputFactory eINSTANCE = fumlConfiguration.Input.impl.InputFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Values</em>'.
	 * @generated
	 */
	InputParameterValues createInputParameterValues();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InputPackage getInputPackage();

} //InputFactory
