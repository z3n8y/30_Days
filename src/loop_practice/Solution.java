package loop_practice;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void printMultiples(int n) {
    	for (int i = 1; i <= 10; i++) {
    		System.out.println(n + " x " + i + " = " + (n*i));
    	}
    }
    
    public static void main(String[] args) {
    	System.out.println("Enter a number and I will show you it's multiples:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printMultiples(n);
        scanner.close();
    }
}