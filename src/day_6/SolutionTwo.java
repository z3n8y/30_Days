package day_6;

import java.util.*;

public class SolutionTwo {
	int numberOfWords ;
	String[] words ;
	
	
	Scanner scanner = new Scanner(System.in);

	//setters
	public void setNumberOfWords(int newNumberOfWords) {
		numberOfWords = newNumberOfWords;
	}

	public void enterNumberOfWords() {
		setNumberOfWords(scanner.nextInt());
	}
	
	public void setWords() {
		words = new String[numberOfWords];  		//Create a list for the words from the numberOfWords
		for (int x = 1; x <= numberOfWords; x++) {	
			words[x-1] = scanner.next();			//Add each word to the list
		}
	}
	
	// Check the words
	public void checkWords() {
		System.out.println("Checking Words in list:");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
	
	public static void splitWord(String word) {
		// Split the word into characters.
		String evens = "";
		String odds = "";
		char[] characters = word.toCharArray();     //Split into characters
		for (int i = 0; i < word.length(); i++) {	//Iterate characters
			if (i%2 == 0) {							
				evens += characters[i];				//Evens into the even string
			} else {
				odds += characters[i];				//Odds into the odd string
			}
		}
		System.out.println(evens + " " + odds);		//Combine even and odds and print
	}
	
	public static void splitEmUp() {
		SolutionTwo sol = new SolutionTwo();	//Create instance
		sol.enterNumberOfWords();				//Take number of words
		sol.setWords();					//Add words to list
		for (int i = 0; i < sol.words.length; i++) {
			splitWord(sol.words[i]);   // Split each word into it's even and odd characters.
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		splitEmUp();
		
		
	}

}
