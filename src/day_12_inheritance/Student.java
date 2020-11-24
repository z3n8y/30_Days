package day_12_inheritance;

public class Student extends Person {
	//private static String firstName;
	//private static String lastName;
	//private static int identification;
	public int[] scores;
	
	
	public Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		this.scores = scores;
	}

	
	public char calculate() {
		int total = 0;
		for (int i = 0; i < this.scores.length; i++) {
			total += scores[i];
		}
		double avg = total/ this.scores.length;
		
		if (avg < 40) {
			return 'T';
			} else if (avg < 55) {
				return'D';
			} else if (avg < 70) {
				return 'P';
			} else if (avg < 80) {
				return 'A';
			} else if (avg < 90) {
				return 'E';
			} else {
				return 'O';
			}
	}
	
	
	public static void main(String[] args) {
		
		int[] scoresTest = new int[] {78, 43, 53, 78, 88, 99, 54};
		Student stu = new Student("Tom", "Tums", 149, scoresTest);
		System.out.println(stu.calculate());
		System.out.println(stu.firstName);
	}
	
	
}
