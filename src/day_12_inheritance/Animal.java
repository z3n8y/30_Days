package day_12_inheritance;

public abstract class Animal {
	public int age;
	
	public Animal(int Age) {
		this.age = Age;
		System.out.println("An animal has been created!");
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("An animal is sleeping.");
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Cat c = new Cat();
		d.eat();
		c.eat();
		d.sleep();
		c.sleep();
		
		
		//Casting
		Object dog = new Dog();
		Dog realDog = (Dog) dog;
		realDog.ruff();
		
		Object str = "est";
		String realStr = (String) str;
		System.out.println(realStr.endsWith("t"));
		
		//What happens when...
		Dog doggy = new Dog();
		if (d instanceof Animal) {
			Animal animal = (Animal) doggy;
			animal.sleep();
		}
		
		
		
	}

}
