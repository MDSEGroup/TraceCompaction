package ca.pfv.spmf.algorithms.frequentpatterns.lcm;



	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import trace.LeafObjectState;
import trace.LeafParameterList;
import trace.ObjectState;
import trace.ParameterList;
import trace.ParameterValue;
import trace.Trace;
	import trace.Value;
	import static tracemetamodel.xtend.stateOperation.*;
	import static tracemetamodel.xtend.parameterOperation.*;
	/* This file is copyright (c) 2012-2014 Alan Souza
	* 
	* This file is part of the SPMF DATA MINING SOFTWARE
	* (http://www.philippe-fournier-viger.com/spmf).
	* 
	* SPMF is free software: you can redistribute it and/or modify it under the
	* terms of the GNU General Public License as published by the Free Software
	* Foundation, either version 3 of the License, or (at your option) any later
	* version.
	* SPMF is distributed in the hope that it will be useful, but WITHOUT ANY
	* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
	* A PARTICULAR PURPOSE. See the GNU General Public License for more details.
	* You should have received a copy of the GNU General Public License along with
	* SPMF. If not, see <http://www.gnu.org/licenses/>.
	*/
	/**
	 * This is the parser class for the dataset.
	 * It has actions related to parse a txt based file to a Dataset class.
	 *
	 * @see AlgoLCM
	 * @author Alan Souza <apsouza@inf.ufrgs.br>
	 */
	public class traceDataSet {

	    private List<Transaction> transactions;
	    private Integer[] transactionsItems;
	    
	    Set<Integer> uniqueItems = new HashSet<Integer>();

		private int maxItem = 0;


	    public traceDataSet(Trace mytrace, int p) throws IOException {

	        transactions = new ArrayList<Transaction>();
	        
	        String items;
	        if (p==1) { // for objectstate
	        for ( ObjectState o: mytrace.getObjectstate())
		      {
	        	items= createObjectstateString(mytrace,o);
		        getTransactions().add(createTransaction(items));
	     
	        }
	        }
	        else{ // for parameterlist
		        for ( ParameterList o: mytrace.getParameterlist())
			      {
		        	items= createParameterListString(mytrace,o);

			        getTransactions().add(createTransaction(items));
		     
		        }

	        }
	        /// sort transactions by increasing last item (optimization)
	        Collections.sort(transactions, new Comparator<Transaction>() {
				public int compare(Transaction arg0, Transaction arg1) {
//					return arg0.getItems().length - arg1.getItems().length;
					return arg0.getItems()[arg0.getItems().length -1] - 
							arg1.getItems()[arg1.getItems().length -1]; 
				}});
	        
	        // create the list of items in the database and sort it
	        transactionsItems = new Integer[uniqueItems.size()];
	        int i=0;
	        for(Integer item : uniqueItems) {
	        	transactionsItems[i++] = item;
	        }
	        Arrays.sort(transactionsItems);
	        
	        // TODO :  maybe sorting items and transactions by decreasing order of support
	        // could help
	    }

	    public String createParameterListString(Trace mytrace,ParameterList paramlist)
	  	  {
	  		String strobjvalue ="";
	  		int i=0;
	  		 EList<ParameterValue> Currentparametervaluelist = new BasicEList<ParameterValue>();
	  		if (paramlist instanceof LeafParameterList)
	  			Currentparametervaluelist.addAll(((LeafParameterList) paramlist).getParametervalue());
		       
		    else
		    	getParameterValuelist(paramlist,Currentparametervaluelist);
	  		
	  		for (ParameterValue v: Currentparametervaluelist){
	  			if (Currentparametervaluelist.contains(v))
	  			   strobjvalue=strobjvalue + i + " ";
	  			i=i+1;
	  			
	  		}
	  		
	  		return strobjvalue;
	  	  }
	        public String createObjectstateString(Trace mytrace,ObjectState objstate)
	  	  {
	  		String strobjvalue ="";
	  		int i=0;
	  		 EList<Value> Currentobjectvaluelist = new BasicEList<Value>();
	  		if (objstate instanceof LeafObjectState)
		        Currentobjectvaluelist.addAll(((LeafObjectState) objstate).getValue());
		       
		    else
		        getobjectStateValues(objstate,Currentobjectvaluelist);
	  		
	  		for (Value v: Currentobjectvaluelist){
	  			if (Currentobjectvaluelist.contains(v))
	  			   strobjvalue=strobjvalue + i + " ";
	  			i=i+1;
	  			
	  		}
	  		
	  		return strobjvalue;
	  	  }
	    /**
	     * Create a transaction object from a line from the input file
	     * @param line a line from input file
	     * @return a transaction
	     */
	    private Transaction createTransaction(String line) {

	        //build the items
	        Pattern splitPattern = Pattern.compile(" ");
	        String[] items = splitPattern.split(line);

	        Integer[] itemsSorted = new  Integer[items.length];

	        for (int i = 0; i < items.length; i++) {
	        	Integer item = Integer.valueOf(items[i]);
	        	itemsSorted[i] = item;

	            uniqueItems.add(item);
	        }

	        // update max item by checking the last item of the transaction
	        int lastItem = itemsSorted[itemsSorted.length - 1];
	        if(lastItem > maxItem) {
	            maxItem = lastItem;
	        }
	        return new Transaction(itemsSorted);
	    }

	    public List<Transaction> getTransactions() {
	        return transactions;
	    }

	    public Set<Integer> getUniqueItems() {
			return uniqueItems;
		}


//	    public Integer[] getAllItems() {
	//
//	        return transactionsItems;
//	    }

	    public int getMaxItem() {
	        return maxItem;
	    }

	    @Override
	    public String toString() {
	        StringBuilder datasetContent = new StringBuilder();

	        for(Transaction transaction : transactions) {
	            datasetContent.append(transaction);
	            datasetContent.append("\n");
	        }
	        return datasetContent.toString();
	    }

	}


