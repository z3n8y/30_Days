package day_9_recursion;

public class RecursionGoodLuck {

	// f(f(f(f(x)))) ---> x = 20
	// f(x) = 5 + a
	// f(20) = 5 + 20  = 25
	// f(f(20)) = 5 + 25 = 30
	// f(f(f(20))) = 5 + 30 = 35
	// f(f(f(f(20)))) = 5 + 35 = 40
	
	
	// Summation
	// 5+4+3+2+1+0; 7+6+5+4+3+2+1+0;
	public static int Summation(int n) {
		// Base Case: WE ARE AT THE END
		if (n <= 0) { 
			return 0; // additive identity property	
		} else { // Recursive Case: KEEP GOING
			//3 + Summation(2) --> keep going
			//3 + 2 + Summation(1) --> keep going
			//3 + 2 + 1 + Summation(0) --> this is the end
			// return 3 + 2 + 1 + 0 = 6
			return n + Summation(n-1);
		}
	}
	
	// 5! = 5*4*3*2*1 = 5 * 4!
	public static int Factorial(int n) { 
		if (n <= 1) {  	//Base Case
			return 1; //Multiplicative identity property
		} else {		//Recursive Case
			// 4 * Factorial(3)
			// 4 * 3 * Factorial(2)
			// 4 * 3 * 2 * Factorial(1)
			// 4 * 3 * 2 * 1 --> 24
			return n * Factorial(n-1);
		}
	}
	
	public static int Exponentiation(int n, int x) { //n^x
		if (x <= 0) { 
			return 1;
		} else {
			return n * Exponentiation(n, x-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 + 2 + 1
		System.out.println(Summation(7));
		System.out.println(Factorial(4));
		System.out.println(Exponentiation(5, 3));
	}

}
