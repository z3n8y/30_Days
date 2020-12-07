package day_19_interfaces;

public class Hero implements Character {
	
	public String weapon = "Light Saber";
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}
	
	public void attack() {
		System.out.println("The hero attacks the enemy!");
	}
	
	public void heal() {
		System.out.println("The hero heal you!");
	}
	
}
