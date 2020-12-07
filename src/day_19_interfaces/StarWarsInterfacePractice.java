package day_19_interfaces;

import java.util.Random;
public class StarWarsInterfacePractice {

	public static Character summonCharacter() {
		Random rand = new Random();
		if (Math.abs(rand.nextInt()) % 2 == 0){
			return new Enemy();
		} else {
			return new Hero();
		}
	}

	public static void main(String[] args) {
		Enemy darthVader = new Enemy();
		Hero ObiWanKenobi = new Hero();
		
		darthVader.weaponDraw();
		ObiWanKenobi.attack();
		darthVader.attack();
		ObiWanKenobi.heal();
		darthVader.heal();
		
		System.out.println("Enemy weapon is a " + darthVader.weapon);
		
		Character spy = summonCharacter();
		
		spy.attack();
		
	}
	
	

}
