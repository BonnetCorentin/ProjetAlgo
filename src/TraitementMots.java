import java.util.*; 

public class TraitementMots {
	static public Hashtable<String,Integer> redondanceMot (ArrayList <String> listOfWord) {
		Hashtable<String,Integer> hashtable= new Hashtable<String,Integer>();
		
		
		for (int i=0;i<listOfWord.size();i++) {
		 	Integer n = hashtable.putIfAbsent(listOfWord.get(i),1);
		 	
		 	if (n != null) {
		 		n++;
		 		hashtable.replace(listOfWord.get(i), n);
		 	}
		 	
		}
		
		return hashtable;
	}
}
