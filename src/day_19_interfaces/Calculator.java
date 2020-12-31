package day_19_interfaces;

public class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	int sumOfDivisors = 0;
    	for (int i = n; i > 0 ; i --) { //for each integer between n and 0
    		if (n % i == 0) {			// if n is divisible by that integer
    			sumOfDivisors += i;		// add it to the sum
    		}
    	}   	  	
       return sumOfDivisors;
    }
}
