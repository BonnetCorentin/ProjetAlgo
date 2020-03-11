import java.util.*; 

public class TraitementMots {
	static private int somme;
	
	static public Hashtable<String,Integer> redondanceMot (ArrayList <String> listOfWord) {
		Hashtable<String,Integer> hashtable= new Hashtable<String,Integer>();
		
		
		for (int i=0;i<listOfWord.size();i++) {
		 	Integer n = hashtable.putIfAbsent(listOfWord.get(i),1);
		 	
		 	if (n != null) {
		 		n++;
		 		hashtable.replace(listOfWord.get(i), n);
		 	}
		 	hashtable.remove("");
		}
		
		return hashtable;
	}
	
	static public Hashtable<String,Float> frequenceMot (ArrayList <String> listOfWord){
		Hashtable<String,Float> hashtable= new Hashtable<String,Float>();
		Hashtable<String,Integer> n= new Hashtable<String,Integer>();
		
		n=redondanceMot(listOfWord);
		somme=0;
		
		try { 
			 n.forEach((k, v) -> { 
				 somme+=v;
			 }
			); 
	      } 
	      catch (Exception e) { 
	    	  System.out.println("Exception: " + e); 
	      } 
		
	
		try { 
			 n.forEach((k, v) -> { 
				 Float a = ((float)v)/((float)somme)*100;
				 hashtable.put(k,a);
			 }
			); 
	      } 
	      catch (Exception e) { 
	    	  System.out.println("Exception: " + e); 
	      } 
		
		return hashtable;
	}
}
	
	

