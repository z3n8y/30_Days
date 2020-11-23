package day_11_2d_array;

import java.util.Arrays;

public class ArrayPractice {

	public ArrayPractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[6][6];
		String[][] arr2 = new String[4][4];
		
		
		//Reading setting 
		arr[0][0] = 10;
		System.out.println(arr[0][0]);
		
		int height = arr.length;
		int width = arr[0].length;
		
		//good to set
		int lastRow = arr.length -1; 
		int lastCol = arr[0].length -1;
		
		arr[lastRow][lastCol] = 99;
		
		
		//loop all elements
		for (int r=0; r < arr.length; r++) {
			for (int c=0; c < arr[0].length; c++) {	
				arr[r][c] = 0;
			}
		}	
		for (int r = 0; r <= lastRow; r++) {
			for (int c = 0; c < lastCol; c++) {
				
			}
		}
		
		//loop edges
		for (int c = 0; c <= lastCol; c++) {
			arr[lastRow][c] = 9;
			arr[0][c] = 1;
		}
		
		for (int r = 0; r <= lastRow; r++) {
			arr[r][0] = 2;
			arr[r][lastCol] = 3;
		}
		for (int r = 0; r < arr.length; r++) {
			System.out.println(Arrays.toString(arr[r]));
		}
		
		int numOfSubArrays = 0;
		int maxSum = 0;
		
		for (int i = 0; i <= arr.length - 3; i++) {
			for (int j = 0; j <= arr[0].length - 3; j++) {
				System.out.println("");
				int[][] subArr = new int[3][3]; // create a 3x3 sub-array
				numOfSubArrays ++;
				for (int r = 0; r < subArr.length; r++) { // each
					for (int c = 0; c < subArr[0].length; c++) {
						subArr[r][c] = arr[r+i][c+j];
					}
				}
				for (int r = 0; r < subArr.length; r++) {
					System.out.println(Arrays.toString(subArr[r]));
				}

				int sum = (subArr[0][0] + subArr[0][1] + subArr[0][2] + subArr[1][1] + subArr[2][0] + subArr[2][1]
						+ subArr[2][2]);
				if (sum > maxSum) {
					maxSum = sum;
				}
				System.out.println(sum);
			}
		}
		System.out.println(numOfSubArrays);
		System.out.println(maxSum);
	}

}
