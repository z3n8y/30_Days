
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
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Min Speed: " + minSpeed);
		System.out.println("Current Speed: " +currentSpeed);
		System.out.println("Weight: " + weight);
		System.out.println("Car is on: " + isTheCarOn);
		System.out.println("Condition: " + condition);
		System.out.println("Name of Car: " + nameOfCar);
		System.out.println("Max Fuel: " + maxFuel);
		System.out.println("Current Fuel: " + currentFuel);
		System.out.println("MPG: " + mpg);
		System.out.println("People in car: " + numberOfPeopleInCar);
		System.out.println("");
	}
	//instance methods
	public void wreckCar() {
		condition = 'C';
	}
	
	public void getIn() {
		numberOfPeopleInCar ++;
	}
	
	public void getOut() { 
		numberOfPeopleInCar --;
	}
	
	public double homManyMilesUntilOutOfGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillup() {
		return maxFuel * mpg;
	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car birthdayPresent = new Car(500, 5000.5, true);		
		System.out.println("Birthday Car v1");
		birthdayPresent.printVariables();
		
		//Changes
		birthdayPresent.getIn();
		birthdayPresent.getIn();
		birthdayPresent.getIn();
		System.out.println("Miles Left: " + birthdayPresent.homManyMilesUntilOutOfGas());
		System.out.println("Birthday Car v2");
		birthdayPresent.printVariables();
		
		birthdayPresent.getOut();
		System.out.println("Birthday Car v3");
		birthdayPresent.printVariables();
	}

}
