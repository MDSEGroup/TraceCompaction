package petrinet.semantics.gemoc

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import petrinet.Net
import petrinet.Place
import petrinet.Transition

import static extension petrinet.semantics.gemoc.TransitionAspect.*

@Aspect(className=Net)
public class NetAspect {

	@InitializeModel
	def void initialize(List<String> args) {
	
	}

	@Main
	@Step
	public def static void run() {
	
		var int c = 0
		var nextTransition = _self.transition.findFirst[t|t.canbefired()]
		while (nextTransition != null && c < 59) {

			nextTransition.fire

			nextTransition = _self.transition.findFirst[t|t.canbefired()]
			c = c + 1

		}

	}

}

@Aspect(className=Place)
class PlaceAspect {

	def void increment() {
		println("Invoking MyPlaceAspect::increment()")
		_self.tokens = _self.tokens + 1
//	var t=_self.tokens.get(0).intValue + 1
//
//	_self.tokens.set(0,t) 

	}

}

@Aspect(className=Transition)
class TransitionAspect {
	int inputsum = 0 // local 
	int outputsum = 0 // local
	boolean enabled = false

	@Step
	def void fire() {
		println("Invoking MyTransitionAspect::fireTransition()")
		if (_self.input.forall[place|place.tokens > 0]) {

			for (Place place : _self.input) {
				place.tokens = place.tokens - 1
			}
			// Adding a token to each output place
			for (Place place : _self.output) {
				place.tokens = place.tokens + 1
				
			}

		}
	println("Invoking MyTransitionAspect::fireTransition()")
//		if (_self.input.forall[place|place.tokens.get(0) > 0]) {
//
//			for (Place place : _self.input) {
//				var t=place.tokens.get(0).intValue - 1
//				place.tokens.set(0,t) 
//				
//			}
//			// Adding a token to each output place
//			for (Place place : _self.output) {
//				var t=place.tokens.get(0).intValue + 1
//				place.tokens.set(0,t) 
//			}
//
//		}
	}

	def boolean canbefired() {
		return _self.input.forall[p|p.tokens > 0]
	}
	


}
