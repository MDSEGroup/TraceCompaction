package tracemetamodel.java;
//


import org.eclipse.emf.common.util.EList;

//
//import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Set;
//
//import org.eclipse.emf.common.util.EList;
//
import trace.RepeatingStep;


public class stepOperations {
	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////Traversing to the trace for finding a repeating step with the specific steptype//////
	// /*****************
	// /////////////////////////////////////////////////////////////////////////////////////////
//	public static RepeatingStep findRepeatingStep (Trace trace, RepeatingStep step)
////		{
////		RepeatingStep Resultstep=null;
////		 if (step.getChildren().size()==0){
////			 for(Iterator<RepeatingStep> i= trace.getRepeatingstep().iterator(); i.hasNext();)
////   	     		 {
////			      RepeatingStep Repeatstep=(RepeatingStep)i.next();
////			      	if (Repeatstep.getSteptype().getStepName()==step.getSteptype().getStepName() &&
////			      			Repeatstep.getChildren().size()==0)
////			      			return Repeatstep;
////   	     		 }
////		   return null;
////		 }
////		 else
////		 {
////			 for(Iterator<RepeatingStep> i= step.getChildren().iterator(); i.hasNext();)
////			 {
////			      RepeatingStep Repeatstep=(RepeatingStep)i.next();
////		          Resultstep =findRepeatingStep(trace, Repeatstep);
////			        if (Resultstep==null)
////			    			return null;	    			 
////	    	 }
////		  return step;
////		 }
//			RepeatingStep Resultstep=null;
//			
//			for(Iterator<RepeatingStep> i= trace.getRepeatingstep().iterator(); i.hasNext();)
//	   	     		 {
//				      RepeatingStep Repeatstep=(RepeatingStep)i.next();
//
//				      if (Repeatstep==step.getSteptype().getStepName()
//				       Resultstep =findRepeatStep(trace, Repeatstep, stepname);
//				        if (Resultstep!=null)
//				    			return Resultstep;	    			 
//		    		 }
//			return null;
//}
//	
	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////Traversing to the trace for finding a repeating step with the specific steptype//////
	// /*****************
	// /////////////////////////////////////////////////////////////////////////////////////////

//	  public static RepeatingStep findRepeatStep (Trace trace, RepeatingStep root, String stepname)
//		{
//			 //Avoid infinite loops
//			 RepeatingStep retstep=null;
//	         RepeatingStep f1=null;
//			 int i=0;
//
//	       if(root == null) return null;
//			
//		 
//			if (root.getChildren().size()!=0)
//	 			 while (i<root.getChildren().size())
//				  {
//				   f1=root.getChildren().get(i);
//				
//				  	   retstep= findRepeatStep(trace, f1,stepname);
//				  	   if (retstep != null)
//					    return retstep;
//				  	   i=i+1;
//				    }
//			   if (root.getSteptype().getStepName()==stepname) 
//			    // if (root.getOriginalobject().toString()==stepname) //TODO : the criterea for comparing the steps
//			     {
//			     	return root;
//			  	  }
//			  	  return null;
//	     }
	// /////////////////////////////////////////////////////////////////////////////////////////
		// ////Traversing to a repeatingstep to collect all its content /////
		// /*****************
		// /////////////////////////////////////////////////////////////////////////////////////////

		  public  static RepeatingStep getRepeatingStepallContent (RepeatingStep root, EList<RepeatingStep> rlist)
			{
				 //Avoid infinite loops
				 RepeatingStep retstep=null;
		         RepeatingStep f1=null;
				 int i=0;

		       if(root == null) return null;
				
			 
				if (root.getChildren().size()!=0)
		 			 while (i<root.getChildren().size())
					  {
					   f1=root.getChildren().get(i);
					   		rlist.add(f1);
					  	   retstep= getRepeatingStepallContent(f1,rlist);
					  	   if (retstep != null)
						    return retstep;
					  	   i=i+1;
					    }
				
				  	  return null;
		     }
		

	// /////////////////////////////////////////////////////////////////////////////////////////
	// ////Traversing to the trace for finding a repeating step with the specific steptype//////
	// /*****************
	// /////////////////////////////////////////////////////////////////////////////////////////
//	public static int getCountstepinPattern (Trace trace, StepPattern steppattern)
//		{
//				int childnumber=1;
//				
//				for(Iterator<RepeatingStep> i= steppattern.getRepeatingstep().iterator(); i.hasNext();)
//		   	      {
//					RepeatingStep repeatstep=(RepeatingStep)i.next();
//				   	childnumber=childnumber+RepeatingStepAspect.childcount(repeatstep);
//		   	      }
//				
//				return childnumber;
//	
//}

	

}
