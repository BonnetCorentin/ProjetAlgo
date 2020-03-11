import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class ManipulationFichier {
	private final String nomFichier;
	private FileReader fichier;
	private BufferedReader bufferLecture;
	
	public ManipulationFichier (String nomFichier) {
		this.nomFichier = nomFichier;
	}
	
	private void debutTraitement () {
		try {
			fichier = new FileReader(new File(nomFichier));
			bufferLecture = new BufferedReader(fichier);    		    

		}
		catch (IOException e) {
		    	e.printStackTrace();
		}
	}
	
	private void finDeTraitement () {
		try {
			bufferLecture.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getArrayListOfWord () {
		debutTraitement ();
		
		ArrayList <String> arrayOfWord=new ArrayList <String>();
		
		try {	
			String line;
		    while ((line = bufferLecture.readLine()) != null) {
		    	String[] wordsLine = line.split("[\\.\\s]");
		    	for (int i=0;i<wordsLine.length;i++)
		    		arrayOfWord.add(wordsLine[i]);
		    	
		    }
		}
		catch (IOException e) {
		    	e.printStackTrace();
		}		
		
		finDeTraitement ();
		
		return arrayOfWord;
	}
	
	public ArrayList<String> getArrayListOfLine () {
		debutTraitement ();
		
		ArrayList <String> arrayOfLine=new ArrayList <String>();
		
		try {	
			String line;
		    while ((line = bufferLecture.readLine()) != null) {
		    	arrayOfLine.add(line);
		    }
		}
		catch (IOException e) {
		    	e.printStackTrace();
		}		
		
		finDeTraitement ();
		
		return arrayOfLine;
	}
	
}
