package day_7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static int[] flipArray(int[] array) {
		//non destructive
		int l = array.length;
		int[] newArray = new int[l];
		for (int i = l - 1; i >= 0; i-- ) {
			int c =  l - i - 1;
			newArray[c] = array[i];
		}	
		return newArray;
	}	
	
	public static void printArrayItems(int[] array) {
		String printThis = "";
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			printThis += item;
			//System.out.print(item);
			if (i < array.length -1 ) {
				printThis += " ";
				//System.out.print(" ");			
			}
		}
		System.out.println(printThis);		
	}
	
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //take N
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //make integer array from String array
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
        
       //do the flip
       int[] newArray = flipArray(arr);
       //System.out.println(Arrays.toString(newArray));
       printArrayItems(newArray);
    }
}
