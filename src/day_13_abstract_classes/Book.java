package day_13_abstract_classes;

public abstract class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	abstract void display();


}
