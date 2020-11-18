import java.io.*;
import java.util.*;



public class Solution {

	Scanner scanner = new Scanner(System.in);
	
	public static String splitter(String string, boolean evens) {
		int x = string.length();
		int i = 0;
		String stringOut = "";
		if (evens) {
			while (i < x) {
				stringOut += string.charAt(i);
				i ++;
				i ++;
			}
		} else {
			while (i < x) {
				i ++;
				stringOut += string.charAt(i);				
				i ++;
			}
		}
		return stringOut;
	}
	
	
	public static void splitString(String string) {
		String evenString = splitter(string, true);
		
		String oddString = splitter(string, false);
		
		String split = evenString + " " + oddString;
		System.out.println(split);
	}
	
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. 
         * Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	String string = "Hacker";
    	splitString(string);
    }
}
