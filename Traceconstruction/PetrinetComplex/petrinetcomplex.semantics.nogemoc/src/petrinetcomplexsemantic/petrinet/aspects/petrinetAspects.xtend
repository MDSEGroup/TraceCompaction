package petrinetcomplexsemantic.petrinet.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import petrinet.Net
import petrinet.PetrinetFactory
import petrinet.Place
import petrinet.Transition
import petrinet.Token

import trace_constructor.notaddon.GenericTraceConstructor

import static extension petrinetcomplexsemantic.petrinet.aspects.TransitionAspect.*

import java.util.List
import org.eclipse.emf.common.util.BasicEList

@Aspect(className=Net)
public class NetAspect {

	@InitializeModel
	def void initialize(List<String> args) {
	
	}

	@Main
	@Step
	public def static void run() {

	 var traceConstructor = new GenericTraceConstructor()
		// Trace constructor
		
		traceConstructor.initTrace(_self.eContents)

	      	var List<Object> param1=new BasicEList<Object>();
			param1.addAll(_self)
			
			// Trace constructor
			//traceConstructor.beforeStep(nextTransition.name, makeElistParameter(nextTransition))
			traceConstructor.beforeStep("Run", param1)
        var int c=0
		var nextTransition = _self.transition.findFirst[t|t.canbefired()]
		while (nextTransition != null && c<59) {
			var Object o=null;
			//EList<String> stringList = new BasicEList<String>();
			var List<Object> param=new BasicEList<Object>();
			param.addAll(nextTransition)
			
			// Trace constructor
			//traceConstructor.beforeStep(nextTransition.name, makeElistParameter(nextTransition))
			traceConstructor.beforeStep("fire", param)
	     
			nextTransition.fire
			
			param.clear
			// Trace constructor
			traceConstructor.afterStep(_self.eContents,param)
			
			nextTransition = _self.transition.findFirst[t|t.canbefired()]
			c=c+1
		

		}
        param1.clear
		// Trace constructor
	    traceConstructor.afterStep(_self.eContents,param1)
		traceConstructor.finishTrace("traceofnongemoc")

	}

}

@Aspect(className=Place)
class PlaceAspect {
//def void increment() {
//		var Token token=PetrinetFactory.eINSTANCE.createToken
//		_self.tokens.add(token)
//
//	}
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
			//	(_self.eContainer as Net).token.remove(place.tokens.last)
		
		
		
				place.tokens.remove(place.tokens.last)
				//place.tokens = place.tokens - 1
			}
			// Adding a token to each output place
			for (Place place : _self.output) {
				var Token token=PetrinetFactory.eINSTANCE.createToken
				place.tokens.add(token)
			//	(_self.eContainer as Net).token.add(token)
			
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



