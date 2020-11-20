package day_9_recursion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

	/*
	 * In order to get this to work in 30 day challenge:
	 * 		*Uncomment lines pertaining to BufferedWriter
	 * 		*Remove the line that prints out the result
	 */


public class Solution {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);          
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	//UNCOMMENT VV
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        
        System.out.println(result);  // <<<REMOVE
        
       
        //bufferedWriter.write(String.valueOf(result)); //<< UNCOMMENT 
        //bufferedWriter.newLine();						//<< UNCOMMENT 
        //bufferedWriter.close();						//<< UNCOMMENT 

        scanner.close();
    }
}
