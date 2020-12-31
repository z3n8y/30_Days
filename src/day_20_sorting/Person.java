package day_20_sorting;

import static day_20_sorting.HairColor.*;
public class Person {
	
	HairColor hairColor = BLONDE;
	
	
	public Person() {
		
	}

	public static void main(String[] args) {
		Person peterParker = new Person();
		Person spiderMan = peterParker;

		spiderMan.hairColor = PINK;
		System.out.println("Hair Color of Peter Parker is " + peterParker.hairColor);
		System.out.println("Hair Color of Spider Man is " + spiderMan.hairColor);
		
	}

}
