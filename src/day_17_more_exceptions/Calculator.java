package day_17_more_exceptions;

public class Calculator {
	
	
	public void Message() throws Exception{
		throw new Exception("n and p should be non-negative");
	}
	
	public int power(int n, int p) throws Exception {
		if (p < 0 | n < 0) {
			Message();
		}
		if (p <= 0) { 
			return 1;
		} else {
			return n * power(n, p-1);
		}

	}

	
}
