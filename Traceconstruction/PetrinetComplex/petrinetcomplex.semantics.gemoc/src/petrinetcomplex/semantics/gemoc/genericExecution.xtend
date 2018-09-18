package petrinetcomplex.semantics.gemoc

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import petrinet.Net
import petrinet.PetrinetFactory
import petrinet.Place
import petrinet.Transition
import petrinet.Token


import static extension petrinetcomplex.semantics.gemoc.TransitionAspect.*

import java.util.List

@Aspect(className=Net)
public class NetAspect {
var Boolean _isfirsttime=true
	@InitializeModel
	def void initialize(List<String> args) {

	
	}

	@Main
	@Step
	public def static void run() {

		var int i=0
		//for each place that has initialtokens , we create Token in run time
		for (Place place : _self.place) {
			for (i=0;i<place.initialTokens;i++)
			{
				var Token token=PetrinetFactory.eINSTANCE.createToken
				//place.initialTokens=place.initialTokens-1
				place.tokens.add(token)
			}
	    }  
//		_self._isfirsttime=false
//		}
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
		var Token token=PetrinetFactory.eINSTANCE.createToken
		_self.tokens.add(token)

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
		if (_self.input.forall[place|place.tokens.size > 0]) {

			for (Place place : _self.input) {
				place.tokens.remove(place.tokens.last)
			
			//	(_self.eContainer as Net).token.remove(place.tokens.last)
				//place.tokens = place.tokens - 1
			}
			// Adding a token to each output place
			for (Place place : _self.output) {
				var Token token=PetrinetFactory.eINSTANCE.createToken
				place.tokens.add(token)
				//(_self.eContainer as Net).token.add(token)
			}

		}
	}

	def boolean canbefired() {
		return _self.input.forall[p|p.tokens.size > 0]
	}

}

@Aspect(className=Token)
class TokenAspect {

}



