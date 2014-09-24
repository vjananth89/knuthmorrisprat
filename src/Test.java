import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Test {
	public static void main(String[] args) throws IOException {
		KnuthMorrisPratt k = new KnuthMorrisPratt();
		String text = readFile("/Users/ananth89/Desktop/text1.txt", Charset.defaultCharset());
		String pattern = readFile("/Users/ananth89/Desktop/text2.txt", Charset.defaultCharset());
		  
		int first_occur_position = k.kmp(text, pattern);
		System.out.println("The text '" + pattern + "' is first found on the " + first_occur_position + " position.");
	}
	
	
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}
	
	
}
