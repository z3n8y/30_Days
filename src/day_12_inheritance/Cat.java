package day_12_inheritance;

public class Cat extends Animal {

	public Cat() {
		super(7);
		System.out.println("A cat has been created!");
	}	
	
	public void eat() {
		System.out.println("A cat is eating.");
	}
	
	
	public void meow() {
		System.out.println("The cat meows!");
	}
	
	public void sleep() {
		System.out.println("A cat is sleeping.");
	}
	
	public void prance() {
		System.out.println("The cat prances!");
	}

}

