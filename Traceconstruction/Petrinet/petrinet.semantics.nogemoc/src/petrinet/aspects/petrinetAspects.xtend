package petrinet.aspects
 /* this class is not required any more. the content exists in genericExecution
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import petrinet.Net
import petrinet.Place
import petrinet.Transition
import petrinet.traceconstruction.CompactTraceConstructor

import static extension petrinet.aspects.TransitionAspect.*
//import petrinet.traceconstruction.TraceConstructor

@Aspect(className=Net)
public class NetAspect {
	
	
@InitializeModel
	def void initialize(List<String> args) {
		// TODO
		
	}

	@Main
	@Step
	def void run() {
	
//	var traceConstructor = new TraceConstructor()
	  var traceConstructor = new CompactTraceConstructor()
		// Trace constructor
		traceConstructor.initTrace(_self)
		traceConstructor.beforeRun(_self)
        var int c=0
		var nextTransition = _self.transition.findFirst[t|t.canbefired()]
		while (nextTransition != null && c<61) {

			// Trace constructor
			traceConstructor.beforeFire(_self, nextTransition)

			nextTransition.fire
			
			// Trace constructor
			traceConstructor.afterFire(_self, nextTransition)
			
			nextTransition = _self.transition.findFirst[t|t.canbefired()]
			c=c+1
		

		}

		// Trace constructor
		traceConstructor.afterRun(_self)
		traceConstructor.finishTrace(_self)

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
	def void fire(Transition transition) {
		if (transition.input.forall[place|place.tokens > 0]) {
			// Removing a token from each input place
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
*/


