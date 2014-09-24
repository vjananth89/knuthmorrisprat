import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.*;



public class Content{
	public static void main(String[] args) throws IOException
	{
		

	String text = readFile("/Users/ananth89/Desktop/text1.txt", Charset.defaultCharset());
	String text1 = readFile("/Users/ananth89/Desktop/text1.txt", Charset.defaultCharset());}

  //  Matcher m = Pattern.compile("^Phone number (.*) just texted about property (.*)$").matcher(text);
   // if(m.find()) {
    //  String first = m.group(1); // (714) 321-2620
    //  String second = m.group(2); // 690 Warwick Avenue (679871)
      //System.out.println(first);
      //System.out.println(second);
	//System.out.println(text);
//}
	static boolean testStrings(String a, String b) {

	    if (isValid(a) && isValid(b)) {
	        for (int i = 0; i < 4; i++) {
	            a = a.replaceFirst(String.valueOf(b.charAt(i)), "");
	        }
	        return a.length() <= (4 - 3);
	    }else
	        return false;

	}

	static boolean isValid(String s) {
	    return s.matches("");
	}

	
	

static String readFile(String path, Charset encoding) 
		  throws IOException 
		{
		  byte[] encoded = Files.readAllBytes(Paths.get(path));
		  return new String(encoded, encoding);
		}}