
public class Car {
	
	//Constructors
	int maxSpeed = 100;
	int minSpeed = 0;
	double currentSpeed;
	
	double weight = 4079;
	
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	double maxFuel = 16;
	double carrentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	
	
	public Car(int customMinSpeed, double customWeight, 
			boolean customIsTheCarOn) {
		// TODO Auto-generated constructor stub
		minSpeed = customMinSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
	
	public void printVariables() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(currentSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car birthdayPresent = new Car(500, 5000.5, true);
		birthdayPresent.printVariables();

		
	}

}
