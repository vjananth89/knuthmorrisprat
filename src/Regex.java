import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
 
public class Regex {
 
	public static void main(String[] args) throws InterruptedException {
 
	//	String[] commandf = {
		//		"/bin/sh -c",
			//	" cd /Users/ananth89/Desktop; grep -f text1.txt text2.txt"
			//
	//	};

		try {

		    // Execute the command and wait for it to complete
		    Process child = Runtime.getRuntime().exec("cd /Users/ananth89/Desktop; grep -f text1.txt text2.txt");
		    child.waitFor();

		    // Print the first 16 bytes of its output
		    InputStream i = child.getInputStream();
		    byte[] b = new byte[16];
		    i.read(b, 0, b.length); 
		    System.out.println(new String(b));

		} catch (IOException e) {
		    e.printStackTrace();
		    //System.exit(-1);
		}
	}}