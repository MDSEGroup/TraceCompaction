package trace.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import trace.Value
import trace.TransientObject
import trace.Trace
import trace.LiteralValue
import trace.ObjectState
import trace.RefValue
import trace.State
import trace.NormalStep
import trace.Step
import trace.StepType
import trace.PatternOcurrence
import trace.StepPattern
import trace.PatternOccurrenceStepData
import trace.StepSpec
import trace.LiteralString
import trace.LiteralBoolean
import trace.LiteralInteger
import trace.LiteralFloat
import trace.RepeatingStep
import trace.ParameterValue
import trace.ParameterList
import trace.TransientObjectState
import trace.LeafObjectState
import trace.CompositeObjectState
import trace.CompositParameterList
import trace.LeafParameterList

//import static extension traceAspects.trace.aspects.ValueAspect.*
//import static extension traceAspects.trace.aspects.TracedObjectAspect.*
//import static extension traceAspects.trace.aspects.TraceAspect.*
//import static extension traceAspects.trace.aspects.LiteralValueAspect.*
//import static extension traceAspects.trace.aspects.ObjectStateAspect.*
//import static extension traceAspects.trace.aspects.RefValueAspect.*
//import static extension traceAspects.trace.aspects.BaseStateAspect.*
//import static extension traceAspects.trace.aspects.NormalStepAspect.*
//import static extension traceAspects.trace.aspects.StepAspect.*
//import static extension traceAspects.trace.aspects.StepTypeAspect.*
//import static extension traceAspects.trace.aspects.PatternOcurrenceAspect.*
//import static extension traceAspects.trace.aspects.StepPatternAspect.*
//import static extension traceAspects.trace.aspects.PatternOccurrenceStepDataAspect.*
//import static extension traceAspects.trace.aspects.StepSpecAspect.*
//import static extension traceAspects.trace.aspects.LiteralStringAspect.*
//import static extension traceAspects.trace.aspects.LiteralBooleanAspect.*
//import static extension traceAspects.trace.aspects.LiteralIntegerAspect.*
//import static extension traceAspects.trace.aspects.LiteralFloatAspect.*
//import static extension traceAspects.trace.aspects.RepeatingStepAspect.*
//import static extension traceAspects.trace.aspects.ParameterValueAspect.*
//import static extension traceAspects.trace.aspects.ParameterSetAspect.*
//import static extension traceAspects.trace.aspects.TracedObjectStateAspect.*
//import static extension traceAspects.trace.aspects.LeafObjectStateAspect.*
//import static extension traceAspects.trace.aspects.CompositeObjectStateAspect.*
//import static extension traceAspects.trace.aspects.CompositParameterSetAspect.*
//import static extension traceAspects.trace.aspects.LeafParameterSetAspect.*

@Aspect(className=Value)
abstract class ValueAspect {

}

@Aspect(className=TransientObject)
class TracedObjectAspect {

}

@Aspect(className=Trace)
class TraceAspect {

}

@Aspect(className=LiteralValue)
abstract class LiteralValueAspect extends ValueAspect {

}

@Aspect(className=ObjectState)
abstract class ObjectStateAspect {

}

@Aspect(className=RefValue)
class RefValueAspect extends ValueAspect {

}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=NormalStep)
class NormalStepAspect extends StepAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=Step)
abstract class StepAspect {
 public int position =0

  int nestinglevel=1
  var  Step steptemp = null
  //Calculate level of steps
   public def int getlevelstep()
   {
     _self.steptemp= _self.getParent()
   
     	
    //(_self.steptemp) as BigStep= step as BigStep5
	while (_self.steptemp!=null)
	{
	 _self.nestinglevel=_self.nestinglevel+1
	  _self.steptemp=(_self.steptemp.getParent()) as Step
	}
   		 
      return  _self.nestinglevel
   }

}

@Aspect(className=StepType)
class StepTypeAspect {

}

@Aspect(className=PatternOcurrence)
class PatternOcurrenceAspect extends StepAspect {

}

@Aspect(className=StepPattern)
class StepPatternAspect {

}

@Aspect(className=PatternOccurrenceStepData)
class PatternOccurrenceStepDataAspect {

}

@Aspect(className=StepSpec)
abstract class StepSpecAspect {

 public String signature=""
  public int certificate=0
}

@Aspect(className=LiteralString)
class LiteralStringAspect extends LiteralValueAspect {

}

@Aspect(className=LiteralBoolean)
class LiteralBooleanAspect extends LiteralValueAspect {

}

@Aspect(className=LiteralInteger)
class LiteralIntegerAspect extends LiteralValueAspect {

}

@Aspect(className=LiteralFloat)
class LiteralFloatAspect extends LiteralValueAspect {

}

@Aspect(className=RepeatingStep)
class RepeatingStepAspect extends StepSpecAspect {
///number of child in a pattern : used for findspecificstepafterpos
def int childcount()
{
	var int i=0
	var int totalchildnumber =0
    var RepeatingStep f1=null
		if (i<_self.children.size==0)
		   return 0
		else{
	  	while (i<_self.children.size)
			  {
			   f1=_self.children.get(i)
			     totalchildnumber=totalchildnumber+ f1.childcount()+1
			  	   i=i+1
			    }
		  return totalchildnumber
}
//	  if (_self.children.size==0)
//	  	    return 1

}
}

@Aspect(className=ParameterValue)
class ParameterValueAspect {

}

@Aspect(className=ParameterList)
abstract class ParameterListAspect {

}

@Aspect(className=TransientObjectState)
class TransientObjectStateAspect {

}

@Aspect(className=LeafObjectState)
class LeafObjectStateAspect extends ObjectStateAspect {
 
}

@Aspect(className=CompositeObjectState)
class CompositeObjectStateAspect extends ObjectStateAspect {

}

@Aspect(className=CompositParameterList)
class CompositParameterListAspect extends ParameterListAspect {

}

@Aspect(className=LeafParameterList)
class LeafParameterListAspect extends ParameterListAspect {

}



