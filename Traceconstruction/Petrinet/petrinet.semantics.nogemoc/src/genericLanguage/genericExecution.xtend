package genericLanguage

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import petrinet.Net
import petrinet.Place
import petrinet.Transition
import static trace_constructor.notaddon.GenericTraceConstructor.*
import static extension genericLanguage.TransitionAspect.*
//import petrinet.traceconstruction.TraceConstructor
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import trace_constructor.notaddon.GenericTraceConstructor

@Aspect(className=Net)
public class NetAspect {
	
	
@InitializeModel
	def void initialize(List<String> args) {
		// TODO
		
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
  
	def void increment() {
		println("Invoking MyPlaceAspect::increment()")
		_self.tokens = _self.tokens + 1

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
	}

	def boolean canbefired() {
		return _self.input.forall[p|p.tokens > 0]
	}

}



