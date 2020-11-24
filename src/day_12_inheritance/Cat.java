package day_12_inheritance;

public class Cat extends Animal {

	public Cat() {
		super(7);
		System.out.println("A cat has been created!");
	}	
	
	public void meow() {
		System.out.println("The cat meows!");
	}
	
	public void prance() {
		System.out.println("The cat prances!");
	}

}

