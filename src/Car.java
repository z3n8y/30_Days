
public class Car {
	
	
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
	int maxNumberOfPeopleInCar = 6;
	
	//Constructor
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
		System.out.println("Max Capacity: " + maxNumberOfPeopleInCar);
		System.out.println("");
	}
	//instance methods
	public void wreckCar() {
		condition = 'C';
	}
	
	public void getIn() {
		if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
			numberOfPeopleInCar ++;
			System.out.println("Someone got in.");
		} else {
			System.out.println("The car is full.");
		}
		
	}
	
	public void getOut() { 
		if (numberOfPeopleInCar > 0 ) {
			numberOfPeopleInCar --;
			System.out.println("Someone got out.");
		} else {
			System.out.println("There is no one in the car.");
		}
		
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
	
	public void turnTheCarOn() {
		if (!isTheCarOn) {
			isTheCarOn = true;
			System.out.println("Cshhhhhhhhhgghgg");
		} else {
			System.out.println("The car is already on");
		}
	}
	
	public void turnTheCarOff() {
		//Turns the car off
		if (isTheCarOn) { //if the car is on then turn it off
			isTheCarOn = false;
			System.out.println("Shutting it off.");
		} else { // otherwise print out that it is already off.
			System.out.println("The car is already off");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car birthdayPresent = new Car(500, 5000.5, true);		
		
		//Changes
		birthdayPresent.turnTheCarOff();
		birthdayPresent.turnTheCarOn();
		birthdayPresent.turnTheCarOn();
		birthdayPresent.turnTheCarOff();
		birthdayPresent.turnTheCarOff();
		
		
		
	}

}
