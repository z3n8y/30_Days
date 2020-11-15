import java.util.*;

public class Day_3_Conditionals {

	public Day_3_Conditionals() {
		// TODO Auto-generated constructor stub
	}
	
	public static String isItWierd(int number) {
		
		String whatIsIt;
		if (number % 2 == 1  ) {  				//If number is odd, it is weird
			whatIsIt = "Weird";
		} else {                  				//If number is even,
			if (number >= 6 && number <= 20){  	// And between 6 and 20 inclusively
				whatIsIt = "Weird";            	// it is weird
			} else {						   	// Otherwise 
				whatIsIt = "Not Weird";			// it is not weird
			}	
		}	
		return whatIsIt;
	}
	
	private static final Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
        System.out.println(isItWierd(N));
		
	}

}
