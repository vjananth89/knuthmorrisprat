

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class TextCompare {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fin = new FileReader( "/Users/ananth89/Desktop/text1.txt"); 
		FileReader fin1 = new FileReader( "/Users/ananth89/Desktop/text2.txt"); 
		Scanner s1 = new Scanner( fin ); 
		Scanner s2 = new Scanner( fin1 ); 
		int count1 = 0;
        int count2 = 0;

        // while we have lines left in both files, compare and
        // print the lines that don't match
        while (s1.hasNextLine() || s2.hasNextLine()) {
            String line1 = s1.nextLine().trim(); count1++;
            String line2 = s2.nextLine().trim(); count2++;
            if (!line1.equalsIgnoreCase(line2)) {
                System.out.println("Line " + count1 + " differs.");
                System.out.println("< " + line1);
                System.out.println("> " + line2);
            }
          else {
                System.out.println("Line " + count1 + " matches.");
            }
        }

        // any leftover lines in file1 count as differences
        while (s1.hasNextLine()) {
            String line1 = s1.nextLine(); count1++;
            System.out.println("Line " + count1 + " differs.");
            System.out.println("< " + line1);
            System.out.println("> " );
        }

        // any leftover lines in file2 count as differences
        while (s2.hasNextLine()) {
            String line2 = s2.nextLine(); count2++;
            System.out.println("Line " + count2 + " differs.");
            System.out.println("< ");
            System.out.println("> " + line2);
        }
    }

}
