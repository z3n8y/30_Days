package day_11_2d_array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionBetter {

	public static void printHighestSum(int[][] arr) {
		int iteration = 0;
		int maxSum = 0;
		for (int i = 0; i <= arr.length - 3; i++) {
			iteration ++;
			for (int j = 0; j <= arr[0].length - 3; j++) {
				int sum = (arr[0+i][0+j] + arr[0+i][1+j] + arr[0+i][2+j] + arr[1+i][1+j] + arr[2+i][0+j] + arr[2+i][1+j]
						+ arr[2+i][2+j]);
				if (iteration == 1) {
					maxSum = sum;
				} else {
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}
		System.out.println(maxSum);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		scanner.close();

		printHighestSum(arr);
	}
}
