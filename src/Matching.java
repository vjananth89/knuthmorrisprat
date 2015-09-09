
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Matching{
	public static void main(String[] args) throws java.io.IOException
	{
		String match = null; 
	//read contents from pattern.txt -- written by Vijay	
	ArrayList<String>pattern = new ArrayList<String>(); 
	FileReader f1 = new FileReader( "/Users/ananth89/Desktop/text2.txt"); //pattern.txt goes here
	Scanner sc = new Scanner( f1 ); 
	while( sc.hasNext() ) { 
	pattern.add( sc.nextLine() ); 
	} 
	System.out.println("patterns.txt");
	System.out.println("\n"+pattern);
	sc.close(); 
	//read contents from input.txt
	ArrayList<String> text = new ArrayList<String>(); 
	f1 = new FileReader( "/Users/ananth89/Desktop/text1.txt" ); //input.txt goes here
	sc = new Scanner( f1 ); 
	while( sc.hasNext()) { 
	text.add( sc.nextLine() ); 
	} 
	System.out.println("\ninput.txt");
	System.out.println("\n"+text);
	sc.close(); 
	
	//read every word and look for a pattern
	for( String s : text ) { 
		String [] line = s.split(""); 
		for( int i = 1; i < line.length; i++) { 
		for( String s2 : pattern ) { 
		if( s2.indexOf( line[i] ) >= 0 ) 
			match = s.substring( s.indexOf(" ")-3); 	
	    }
	}
	
	}
	System.out.println("\nMode 1: output");
	System.out.println(match); //print the pattern
	
	}

			}
	
	
