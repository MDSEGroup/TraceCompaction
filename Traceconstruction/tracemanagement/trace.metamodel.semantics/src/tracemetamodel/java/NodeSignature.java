package tracemetamodel.java;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;


public class NodeSignature {
	
	    public String sig;
	    public boolean _ispattern;
	    
	    public NodeSignature()
	    {
	          sig = "";
	          _ispattern = false;
	    }
	    
	    public String getSig() {
			return sig;
		}
		public void setSig(String sig) {
			this.sig = sig;
		}
		public boolean is__ispattern() {
			return _ispattern;
		}
		public void set__ispattern(boolean _ispattern) {
			this._ispattern = _ispattern;
		}
		
		public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
		    for (Entry<T, E> entry : map.entrySet()) {
		        if (Objects.equals(value, entry.getValue())) {
		            return entry.getKey();
		        }
		    }
		    return null;
		}
		
		
	
}
	 
	//When declaring the HashMap:


