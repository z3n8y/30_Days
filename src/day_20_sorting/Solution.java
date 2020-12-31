package day_20_sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static int[] swap(int j, int[] numbers) {
		
		int src = j;
		int dest = j + 1;
		int temp = numbers[src];
		numbers[src] = numbers[dest];
		numbers[dest] = temp;	
		return numbers;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        
        int traversals = 0;
        int madSwaps = 0;
		while (true) {
			traversals++;
			int numberOfSwaps = 0;
			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					a = swap(j, a);
					numberOfSwaps++;
					madSwaps ++;
				}				
			}			
			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {	
				if (traversals == 1) {
					traversals = 0;
				}
				System.out.println("Array is sorted in " + madSwaps + " swaps.");
				System.out.println("First Element: " + a[0]);
				System.out.println("Last Element: " + a[a.length - 1]);
				//System.out.println("Total Number of swaps: " + madSwaps);
				break;
			}
			
		}
	}
    
}