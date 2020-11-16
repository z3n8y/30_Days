package loop_practice;

public class LoopPractice {

	public LoopPractice() {
		// TODO Auto-generated constructor stub
	}
	
	public static void practiceWhileLoop() {
		int x = 0;
		while(x < 5) {
			System.out.println("The value of x is " + x);
			x ++;
		}
	}
	
	public static void practiceDoWhileLoop() {
		int x = 0;
		do {
			System.out.println("The value of x is " + x);
			x ++;
		} while (x < 10);	
	}
	
	public static void practiceForLoop() {
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++ ) {
				System.out.println("("+x+", "+y+")");
			}
		}
		System.out.println("This is the end.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		practiceForLoop();
	}

}
