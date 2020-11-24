package day_13_abstract_classes;

public class MyBook extends Book{
	String title;
	String author;
	int price;
	
	public MyBook(String title, String author, int price){
		super(title, author);
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: "+ this.author);
		System.out.println("Price: " + this.price);
		// TODO Auto-generated method stub
		
	}

}
