import java.util.*;


public class Main {

	public static void main(String[] args) {
		ManipulationFichier a = new ManipulationFichier ("Articles/test.txt");
		
		ArrayList <String>array= a.getArrayListOfWord();
		
		Hashtable<String,Integer> b = TraitementMots.redondanceMot(array);
		
		
		 try { 
			  
	       
	            b.forEach((k, v) -> { 
	  
	                System.out.println (k+" :"+v+" occurences du mot"); 
	            }); 
	        } 
	        catch (Exception e) { 
	  
	            System.out.println("Exception: " + e); 
	        } 
	}

}
