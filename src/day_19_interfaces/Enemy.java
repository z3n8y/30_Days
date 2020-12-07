package day_19_interfaces;

public class Enemy implements Character {
	
	public String weapon = "Light Saber";
	
	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("The enemy attacks YOU!");
	}
	
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println("The enemy heals himself!");
	}
	
	public void weaponDraw() {
		System.out.println("Draw out your weapon");
	}

}
