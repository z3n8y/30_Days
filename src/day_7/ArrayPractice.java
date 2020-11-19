package day_7;

import java.util.Arrays;

public class ArrayPractice {

	public ArrayPractice() {
		// TODO Auto-generated constructor stub
	}

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if (i < array.length -1 ) { 
				System.out.print(", ");			
			}
		}
		System.out.println("]");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Index: [0, 1, 2, 3, 4] 
		// Array: [0, 5, 3, 2, 1] length = 5
		
		//method 1 Declaring
		int[] intArray1;
		//method 2 Allocating
		int[] intArray2 = new int[4];
		//method 3 Initializing
		int[] intArray3 = {6, 4, 1, 9};
		
		String[] shoppingList = {"bannanas", "apples", "pears"};
		
		System.out.println(Arrays.toString(intArray3));
		
		
		// Special for loop : for each
		
		
			
		//Math.abs(rand.nextInt) % length
		
		
	}

}
