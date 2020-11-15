import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	int theNUMBER;
	int max;
	Scanner scanner = new Scanner(System.in);

	public GuessTheNumber() {
		// TODO Auto-generated constructor stub
		Random rand = new Random();
		max = 1000;
		theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
	}

	public void play() {
		while (true) {
			int move = scanner.nextInt();
			if (move > theNUMBER) {
				System.out.println("Your number is too big");
			} else if (move < theNUMBER) {
				System.out.println("Your number is too small");
			} else {
				System.out.println("YOU GOT THE NUMBER!");
				break;
			}
		}
	}

	public static void howBigIsMyNumber(int x) {
		if (x >= 0 && x <= 10) {
			System.out.println("Our number is pretty small.");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Our number is pretty big.");
		} else {
			System.out.println("Our number is out of range.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessTheNumber guessGame = new GuessTheNumber();
		System.out
				.println("Welcome to the game. Try to guess the number between 0 and " + guessGame.max + " inclusive!");
		guessGame.play();
	}

}