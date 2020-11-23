package day_11_2d_array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void printHighestSum(int[][] arr) {
		int numOfSubArrays = 0;
		int maxSum = 0;
		for (int i = 0; i <= arr.length - 3; i++) {
			for (int j = 0; j <= arr[0].length - 3; j++) {

				int[][] subArr = new int[3][3]; // create a 3x3 sub-array
				numOfSubArrays++;
				int iteration = 1;
				for (int r = 0; r < subArr.length; r++) {
					for (int c = 0; c < subArr[0].length; c++) {
						subArr[r][c] = arr[r + i][c + j];
						iteration++;

					}
				}
				int sum = (subArr[0][0] + subArr[0][1] + subArr[0][2] + subArr[1][1] + subArr[2][0] + subArr[2][1]
						+ subArr[2][2]);
				if (numOfSubArrays == 1) {
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
