package tracemetamodel.xtend

import java.util.HashMap
import trace.NormalStep
import trace.Step
import trace.Trace
import tracemetamodel.java.NodeSignature
import tracemetamodel.java.StepMap

import static extension trace.aspects.StepSpecAspect.*

//
class stepOperation {

// val static  Hashtable<String,Integer> MYHASH = new Hashtable<String,Integer>();
	public var static HashMap<Integer, NodeSignature> MYHASH = new HashMap<Integer, NodeSignature>; // for keeping step signatures
	public val static HashMap<Integer, StepMap> StepMap = new HashMap<Integer, StepMap>; // for keeping object of each step
//	public val static HashMap<Integer, StepStatus> AllStepMap = new HashMap<Integer, StepStatus>; // for having all step in root level using in step compaction
	var static int certificate = 0;
	//var static String label

// /////////////////////////////////////////////////////////////////////////////////
// ////
// /*****GET NEXT STEP**************************************************************
// /////////////////////////////////////////////////////////////////////////////////
//	def static public trace.Step getNextStep(Step root,int pos) {
//
////       for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();){
////			EObject o = i.next();
//     if(root == null) return null;
//		
//	   var Step retstep=null;
//        var Step f1=null
//			var int i=0
//		if ((root as NormalStep).children.size!=0)
// 			 while (i<(root as NormalStep).children.size)
//			  {
//			if (root instanceof  NormalStep)
//			   {
//			   f1=(root as NormalStep).children.get(i)
//			
//			  	   retstep= getNextStep(f1,pos)
//			  	   if (retstep != null)
//				    return retstep;
//			    }
//			  	   i=i+1
//			    }
//		     if (root.position==pos) 
//		     {
//		     	return root;
//		  	  }
//		  	  return null
//		  	  }
// /////////////////////////////////////////////////////////////////////////////////
// ////
// /*****GET NEXT STEP AFETR POSITION*************************************************
//// /////////////////////////////////////////////////////////////////////////////////
//def static public NormalStep getNextStepafterPos(Trace trace, NormalStep step, int pos) {
//	var NormalStep nstep=null
//	for (Step p : trace.step)
//	{
//		if (p instanceof NormalStep)
//		{
//	       nstep=getEachNextStepafterPos(p,  step,  pos)
//			if (nstep!=null)
//			   return nstep
//	    }
//	}
//	return nstep
//}
// /////////////////////////////////////////////////////////////////////////////////
// ////
// /*****GET  STEP of the start of a repetition*************************************************
// /////////////////////////////////////////////////////////////////////////////////
//def static public NormalStep getNextStepinAllStepmap(Trace trace, NormalStep step, int interval) {
//
//	var int k=getKeyFromAllStepMap(step)
//	return (AllStepMap.get(k+interval).step as NormalStep)
//}
// /////////////////////////////////////////////////////////////////////////////////
// ////
// /*****GET  STEP AFETR POSITION with specific sig*************************************************
// /////////////////////////////////////////////////////////////////////////////////
//def static public NormalStep getNextStepinAllStepmapbySig(Trace trace, NormalStep step, String sig) {
//
//	var int k=getKeyFromAllStepMap(step) +1 //after the specific step  search is started
//	while (k<AllStepMap.size)
//	{
//		if (AllStepMap.get(k).signature == sig)
//		   return (AllStepMap.get(k).step as NormalStep)
//		k=k+1
//	}
//	
//}
// /////////////////////////////////////////////////////////////////////////////////
// ////
// /*****GET NEXT STEP AFETR POSITION*************************************************
// /////////////////////////////////////////////////////////////////////////////////
//def static public NormalStep getEachNextStepafterPos(NormalStep root, NormalStep step, int pos) {
//{
//	  var NormalStep retstep=null;
//      var NormalStep f1=null
//	  var int i=0
//      //Avoid infinite loops
//      if(root == null) return null;
//		//println(root.signature + " //step:" + step.signature + " root :" + root.position + " pos : " + pos)
//	  if (root.signature==step.signature && root.position==pos)  //// 
//	     {
//	     	return root;
//	  	  }
//	 
//	if (root.children.size!=0)
// 			 while (i<root.children.size)
//			  {
//		     if (root.children.get(i) instanceof  NormalStep)
//			   {
//			   f1=root.children.get(i) as NormalStep
//			
//			  	   retstep= getEachNextStepafterPos(f1,step,pos)
//			  	   if (retstep != null)
//				    return retstep;
//  		      }
//			  	   i=i+1
//			    }
//		   
//		return null
//     }
//
//
//}
// /////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  step with the specific sig//////
// /****************************************************
// /////////////////////////////////////////////////////////////////////////////////
	def static public NormalStep findSpecificStepbySig(Trace trace, String sig) {
		var NormalStep nstep = null
		for (Step p : trace.step) {
			if (p instanceof NormalStep) {
				nstep = findEachSpecificStepbySig(p, sig)
				if (nstep != null)
					return nstep
			}
		}
		return nstep
	}

// /////////////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  step with the specific sig//////
// /*****************
// /////////////////////////////////////////////////////////////////////////////////////////
	def static NormalStep findEachSpecificStepbySig(NormalStep root, String sig) {
		// Avoid infinite loops
		if(root == null) return null;

		var NormalStep retstep = null;
		var NormalStep f1 = null
		var int i = 0
		if (root.signature == sig) {
			return root;
		}
		if (root.children.size != 0)
			while (i < root.children.size) {
				if (root.children.get(i) instanceof NormalStep) {
					f1 = root.children.get(i) as NormalStep
					retstep = findEachSpecificStepbySig(f1, sig)
					if (retstep != null)
						return retstep;
				}
				i = i + 1
			}

		return null
	}

// /////////////////////////////////////////////////////////////////////////////////
// ////calling a method to calculate signature
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
	def static compactStep(Trace trace) {

		trace.step.forEach [ s |
			calculateSignature(trace, s as NormalStep)
		]
		var String virtualTopnodeSig = "VTS/"
		for (Step s : trace.step) {
			virtualTopnodeSig = virtualTopnodeSig + "&" + (s as NormalStep).certificate + "&"
		// virtualTopnodeSig=virtualTopnodeSig + (s as NormalStep).signature.substring((s as NormalStep).signature.indexOf("/"),(s as NormalStep).signature.length-1) 
		}
		var NodeSignature nodesig = new NodeSignature()
		nodesig.sig = virtualTopnodeSig
		MYHASH.put(certificate + 1, nodesig);
//       var int i=1; 
//       var NormalStep e2=trace.step.get(0) as NormalStep
//		while (e2!=null)
//		{ 
//			println((e2 + " :" + e2.signature + " in " + e2.certificate)) 
//			e2 = getNextStep(trace.step.get(0),i) as NormalStep
//			i=i+1
//		}
	}

// /////////////////////////////////////////////////////////////////////////////////
// ////Calculating signature and certificate for each step to find patterns and repetitive parts
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
	def static int calculateSignature(Trace trace, NormalStep step) {
		var int i = 0
		var NormalStep f1 = null
		var int certi = 0
		var int certificate2 = 0
		// var int k=0
		var String sig = ""
		var String bigsig = ""
		if (step.children.size != 0) {
			while (i < step.children.size) {
				f1 = (step.children.get(i) as NormalStep)
				certificate2 = calculateSignature(trace, f1)
				bigsig = bigsig + "&" + certificate2 + "&"
				i = i + 1
			}
			// sig= step.originalobject.toString + "/"+ bigsig+ "&"
			sig = getKeyFromValueStep(step).toString + "/" + bigsig // TODO :  FOR NOW
			certi = CalcNodeSignature(sig)
			step.signature = sig.replace("&&", "&") // TODO
			step.certificate = certi
//	  	          k= getKeyFromAllStepMap(step)
//			  	   AllStepMap.get(k).signature=sig.replace("&&","&")
//			  	   AllStepMap.get(k).certificate=certi
			return certi;

		}

		if (step.children.size == 0) {
			sig = getKeyFromValueStep(step).toString

			certi = CalcNodeSignature(sig)
			step.signature = sig.replace("&&", "&") // TODO : becuase i have to put two & for each certificate, for step i remove that 
			step.certificate = certi
//	  	   k= getKeyFromAllStepMap(step)
//	  	   AllStepMap.get(k).signature=sig.replace("&&","&")
//	  	   AllStepMap.get(k).certificate=certi
			return certi

		}
		throw new RuntimeException()

	}

// /////////////////////////////////////////////////////////////////////////////////
// ////assigning signature for specific node
// /*****************
// /////////////////////////////////////////////////////////////////////////////////
	def static int CalcNodeSignature(String sig) {
		var NodeSignature nodesig = new NodeSignature()

		var int foundcert = 0
		foundcert = getKeyFromValue(sig)
		nodesig.sig = sig
		if (foundcert != 0) {

			MYHASH.get(foundcert).set__ispattern(true)
			return foundcert
		} else {
			certificate = certificate + 1;
			MYHASH.put(certificate, nodesig);
			return certificate
		}

	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// Get key belong to a specific value in object
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static int getKeyFromValueStepMap(Object value) {
		for (int key : StepMap.keySet()) {
			if (StepMap.get(key).object == value) {
				return key;
			}

		}
		return 0;
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// Get key belong to a specific value in StepMap
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static int getKeyFromValueStep(Step value) {
		for (int key : StepMap.keySet()) {
			if (StepMap.get(key).StepSet.contains(value)) {
				return key;
			}

		}
		return 0;
	}

//def static RepeatingStep findRepeatingStep (Trace trace, String sig)
//{
//	return(trace.repeatingstep.findFirst[p | p.signature==sig])
//}
// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// Get key belong to a specific value in Hashmap
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
	def static int getKeyFromValue(String value) {
		for (int key : MYHASH.keySet()) {
			if (MYHASH.get(key).sig == value) {
				return key;
			}

		}
		return 0;
	}

// ///////////////////////////////////////////////////////////////////////////////////////////////////
// **************************************************************************************************
// **************************************************************************************************
// **************************************************************************************************
// Get key belong to a specific step in AllStepMap
// **************************************************************************************************
// ///////////////////////////////////////////////////////////////////////////////////////////////////
//  def static int getKeyFromAllStepMap(Step step) {
//		for (int key : AllStepMap.keySet()) {
//			if (AllStepMap.get(key).step==step) {
//				return key;
//			}
//
//		}
//		return 0;
//	}
// /////////////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a repeating step with the specific steptype//////
// /*****************
// /////////////////////////////////////////////////////////////////////////////////////////
//	def static int getstepCountinPattern (Trace trace, String pattern)
//		{
//				var int childnumber=0;
//				var int k = 0
//				var int i=0
//						// patternoccur.pattern.repeatingstep.forEach[r | 
//				var String interncert = "";
//				var String intersig = ""
//
//				if (!pattern.contains("&")) {
//					// is a small repeating step
//					childnumber=1
//					return childnumber;
//				} else 
//				{ // is a repetitive pattern of different nodes: like  '2@3@4@2@3@4@2@3@4@'
//					interncert = pattern.substring(0, pattern.indexOf("&"))
////							var String firstsig = MYHASH.get(Integer.valueOf(interncert)).sig
////
//					i = i + interncert.length
//					if (i < pattern.length - 1)
//						interncert = pattern.substring(i + 1, pattern.indexOf("&", i + 1))
//					else
//						interncert = ""
//					while (interncert != "") {
//						
//						intersig = MYHASH.get(Integer.valueOf(interncert)).sig
//						childnumber=childnumber + getstepCountinPattern (trace ,intersig)
//						i = i + interncert.length + 1
//						if (i < pattern.length - 1)
//							interncert = pattern.substring(i + 1, pattern.indexOf("&", i + 1))
//						else
//							interncert = ""
//						k = k + 1
//
//					}
//					return childnumber;
//				}	
//			}	
// /////////////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a repeating step in a steppattern//////
// /*****************
// /////////////////////////////////////////////////////////////////////////////////////////
//		  def static RepeatingStep findEachRepeatStepinSteppattern (RepeatingStep root, String sig)
//				{
//	  
//				 //Avoid infinite loops
//				var RepeatingStep retstep=null;
//		        var RepeatingStep f1=null;
//				 var int i=0;
//
//		       if(root == null) return null;
//				
//			 
//				if (root.getChildren().size()!=0)
//		 			 while (i<root.getChildren().size())
//					  {
//					   f1=root.getChildren().get(i);
//					
//					  	   retstep= findEachRepeatStepinSteppattern(f1, sig);
//					  	   if (retstep != null)
//						    return retstep;
//					  	   i=i+1;
//					    }
//				   if (root.signature==sig) 
//				    // if (root.getOriginalobject().toString()==stepname) //TODO : the criterea for comparing the steps
//				     {
//				     	return root;
//				  	  }
//				  	  return null;
//		     }
//		     
//		 // /////////////////////////////////////////////////////////////////////////////////////////
//		// ////Traversing to the trace for finding a repeating step in a steppattern//////
//		// /*****************
//		// /////////////////////////////////////////////////////////////////////////////////////////
//	  def  static RepeatingStep findRepeatStepinSteppattern (StepPattern steppattern, String sig)
//			{
//		 var RepeatingStep result=null;
//		 for (RepeatingStep r : steppattern.getRepeatingstep())
//		       {
//					result=findEachRepeatStepinSteppattern(r,sig);
//							if (result!=null)
//								 return result;
//		        }
//				  return null;
//			}
// /////////////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  step in a trace for deleting it//////
// /*****************
// /////////////////////////////////////////////////////////////////////////////////////////
	def static void removeStepfromTrace(Trace trace, NormalStep step) {
		var Boolean is_found = false
		for (Step r : trace.step) {
			if (r instanceof NormalStep) {
				is_found = findandRemoveStep(trace, null, r, step);

				if (is_found == true)
					return;
			}

		}
	}

// /////////////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  step in a trace and deleting it//////
// /*****************
// /////////////////////////////////////////////////////////////////////////////////////////
	def static boolean findandRemoveStep(Trace trace, NormalStep parent, NormalStep root, NormalStep step) {
		var int i = 0
		var Boolean result = false
		if(root == null) return false;
		if (root == step) {
			if (parent == null)
				trace.step.remove(step)
			else
				parent.children.remove(step)
			return true
		}

		if (root.getChildren().size() != 0) {
			while (i < root.getChildren().size()) {
				if (root.children.get(i) instanceof NormalStep) {
					result = findandRemoveStep(trace, root, root.children.get(i) as NormalStep, step)
					if (result == true)
						return true;

				}
				i = i + 1;
			}
			return false;
		}

		
	}

// /////////////////////////////////////////////////////////////////////////////////////////
// ////Traversing to the trace for finding a  step in a trace for deleting it//////
// /*****************
// /////////////////////////////////////////////////////////////////////////////////////////
// 	  def  static void removePatternOcuurencefromTrace (Trace trace, PatternOcurrence pt)
//	{
//		var Boolean is_found =false
//		 for (Step r : trace.step)
//		    {
//		       	if (r instanceof NormalStep)
//		       	{
//					is_found=PatternOcuurence(trace,null, r ,pt);
//					
//							if (is_found==true)
//								 return;
//		        }
//	
//			}
//		}	
//			
//		  // /////////////////////////////////////////////////////////////////////////////////////////
//	 // ////Traversing to the trace for finding a  step in a trace and deleting it//////
//		// /*****************
//		// /////////////////////////////////////////////////////////////////////////////////////////
// 	 
// 	  def  static boolean findandRemovePatternOcuurence (Trace trace, NormalStep parent,NormalStep root , NormalStep step)
//	   {
//	   	var int i=0
//	   	var Boolean result=false
//		       if(root == null) return false;
//			   if (root==step){
//					if  (parent==null)   
//						trace.step.remove(step)
//					else
//					    parent.children.remove(step) 
//				    return true	    
//			 	}   
//			  
//				if (root.getChildren().size()!=0)
//				{
//		 			 while (i<root.getChildren().size())
//					  {
//					  	if (root.children.get(i) instanceof NormalStep)
//					  	{
//					  	     result=findandRemoveStep(trace,root,root.children.get(i) as NormalStep,step)
//					  	   if (result ==true)
//						    return true;
//
//					  	   
//			             }
//						 i=i+1;
//					    }
//				return false;}
//
//		     }
//		     
}
