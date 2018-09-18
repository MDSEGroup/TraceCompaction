//package tracemetamodel.java;
//
//import java.util.Iterator;
//import java.util.List;
//
//import org.eclipse.emf.common.util.BasicEList;
//import org.eclipse.emf.common.util.EList;
//
//import trace.CompositParameterList;
//import trace.LeafParameterList;
//import trace.ParameterList;
//import trace.ParameterValue;
//import trace.Trace;
//import trace.TraceFactory;
//
//
//public class parameterOperation {
//    // /////////////////////////////////////////////////////////////////////////////////////////
//	// ////compare two ParametervalueLists and see if they share mutual  objects
//	// /*****************
//	// /////////////////////////////////////////////////////////////////////////////////////////
//	//@SuppressWarnings("unchecked")
//	public static int findDifference (EList<ParameterValue>  l,EList<ParameterValue> paramset ){
//	  // LeafParameterList difflist=TraceFactory.eINSTANCE.createLeafParameterList();
//		 int similarnumber=0;
//	//	EList<ParameterValue> difflist = (EList<ParameterValue>) TraceFactory.eINSTANCE.createParameterValue();
//	    for(int i=0;i<l.size();++i)
//	    	if (l.size()==i)
//	    		 return paramset.size()- similarnumber;
//	    	else
//	    	 if (l.contains(paramset.get(i)))
//	    		 similarnumber=similarnumber+1;
//	
//	    return paramset.size()- similarnumber;
//
//		}
//	
//	// /////////////////////////////////////////////////////////////////////////////////////////
//	// ////Traversing to the trace for finding a paraemeterset//////
//	// /*****************
//	// /////////////////////////////////////////////////////////////////////////////////////////
//		public static ParameterList CalculateParameterListIsomorphic (Trace trace, LeafParameterList param)
//			{
//            ParameterList minParam=null;
//			int mindistance	=9999999;
//			
//			int distance =0;
//			for(Iterator<ParameterList> i= trace.getParameterlist().iterator(); i.hasNext();)
//		   	     		 {
//							ParameterList p=(ParameterList)i.next();
//							if (p instanceof LeafParameterList) 
//						 			distance=findDifference(((LeafParameterList) p).getParametervalue(),param.getParametervalue());
//							if (p instanceof CompositParameterList) 
//						    	    distance=findDifference(getParameterValuelist(p),param.getParametervalue());
//					    		
//				    		if (distance ==0)
//				    			return p;
//				    		else 
//				    			if (distance<mindistance)
//				    			{
//				    				mindistance=distance;
//				    				minParam=p;
//				    			}
//			    		 }
//			return (minParam);
//			}
//		
//		// /////////////////////////////////////////////////////////////////////////////////
//		// ////
//		// /*****RETRIVE VALUES OF PARAMETERSET**************************************************************
//		// /////////////////////////////////////////////////////////////////////////////////
//			public static  EList<ParameterValue> getParameterValuelist(ParameterList paramset,EList<ParameterValue> templist) {
//
//		       ParameterList f1=null;
//			   int i=0;
//
//			    if(paramset == null) return templist;
//				
//				if (paramset instanceof CompositParameterList)
//				{
//
//		 			 while (i<((CompositParameterList)paramset).getParameterlist().size())
//					  {
//					   f1=((CompositParameterList)paramset).getParameterlist().get(i);
//					
//					  	   getParameterValuelist(f1,templist);
//				  	  
//					  	   i=i+1;
//					    }
//			    }
//			    else
//			    {
//			    	for (ParameterValue v : ((LeafParameterList)paramset).getParametervalue())
//				   
//				    	   templist.add(v);
//			    	
//		   
//			    }
//			   
//			return templist;
//		  }	
//			
////			//xtend version of getParameterValuelist, if it dosen't work, it will be replaced
////			
////			// /////////////////////////////////////////////////////////////////////////////////
////			// ////
////			// /*****RETRIVE VALUES OF PARAMETERSET**************************************************************
////			// /////////////////////////////////////////////////////////////////////////////////
////				def static  EList<ParameterValue> getParameterValuelist(ParameterList paramset) {
////
////			       var  ParameterSet f1=null;
////				   var int i=0;
////				   var EList<ParameterValue> templist = new BasicEList<ParameterValue>();
////				    if(paramset == null) return templist;
////					
////					if (paramset instanceof CompositParameterSet)
////					{
////			 			 while (i<(paramset as CompositParameterSet).parametersets.size)
////						  {
////						   f1=(paramset as CompositParameterSet).parametersets.get(i)
////						
////						  	   getParameterValuelist(f1);
////					  	  
////						  	   i=i+1;
////						    }
////				    }
////				    else
////				    {
////				    	 templist.addAll((paramset as LeafParameterSet).values);
////			   
////				    }
////				   
////				return templist
////			  }	
//}
