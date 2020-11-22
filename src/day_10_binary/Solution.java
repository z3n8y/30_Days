package day_10_binary;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	int n;
	int oneCount;
	int highCount;
	
	public Solution(int num) {
		n = num;
	}
	
	//getters
	private int getN() {
		return n;
	}
	
	private int getOneCount() {
		return oneCount;
	}
	
	private int getHighCount(){ 
		return highCount;
	}
	
	//setters
	private void setN(int number) {
		n = number;
	}
	
	private void setOneCount(int number) {
		oneCount = number;
	}
	
	private void setHighCount(int number) { 
		highCount = number;
	}
	
	private int BinaryRec(int number) {
		if (number <= 1) {
			setOneCount(getOneCount() + 1);
			checkOneCount();
			return 1;
		} else {
			int i = number % 2;
			if (i == 1) {
				setOneCount(getOneCount() + 1);
			} else {
				setOneCount(0);
			}
			checkOneCount();			
			return BinaryRec(number/2);
		}
	}
	
	private void checkOneCount() { 
		if (oneCount > highCount) {
			highCount = oneCount;
		}
	}
			

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        //int num = 61368;
        Solution sol = new Solution(num);
        sol.BinaryRec(sol.n);

        System.out.println(sol.getHighCount());
        
    }
}