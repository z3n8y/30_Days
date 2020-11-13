
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
	double currentFuel = 8;
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
		System.out.println(nameOfCar);
		System.out.println(maxFuel);
		System.out.println(currentFuel);
		System.out.println(mpg);
		System.out.println(numberOfPeopleInCar);
		System.out.println("");
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
		System.out.println("Birthday Car");
		birthdayPresent.printVariables();
		Car christmasPresent = new Car(550, 2000, false);
		System.out.println("Christmas Car");
		christmasPresent.printVariables();
		
	}

}
