/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Net#getPlace <em>Place</em>}</li>
 *   <li>{@link petrinet.Net#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNet_Place()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNet_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Net
