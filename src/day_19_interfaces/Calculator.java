package day_19_interfaces;

public class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	int f = 0;
    	for (int i = n; i > 0 ; i --) {
    		if (n % i == 0) {
    			f += i;
    		}
    	}
    	  	
       return f;
    }
}
