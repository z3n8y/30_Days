package day_4;

import java.io.*;
import java.util.*;

public class Person {
	int age;
	
	
	public Person( ) {
		
	}
	
	public Person(int initialAge) {
		//Custom constructor with age as parameter. 
		age = initialAge;
		if (age < 0) {		//if the age is less than 0
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;		// Set the age to 0.
		}
	}

	public void amIOld() {
		//Checks if the Person is old
		if (age < 13) {									// If the person is younger than 13
			System.out.println("You are young.");		// they are young.
		} else if (age >= 13 && age < 18) {				// If they are between 13 and 18,
			System.out.println("You are a teenager.");	// they are a teenager.
		} else {										// Otherwise,
			System.out.println("You are old.");			// they are old.
		}
	}

	public void yearPasses() {
		age ++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
	}
}
