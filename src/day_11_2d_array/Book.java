package day_11_2d_array;

public class Book {
	
	//properties, fields, global variables
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;
	int dayCheckedOut = -1;
	
	
	//Constructor
	public Book(String bookTitle, int bookPageCount, int bookISBN) {
		// TODO Auto-generated constructor stub
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckedOut = false;
	}

	//Getters --> INSTANCE METHODS
	public String getTitle() {
		return this.title;
	}
	
	public int getPageCount() {
		return this.pageCount;
	}

	public int getISBN() {
		return this.ISBN;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
	
	public int getDayCheckedOut() {
		return this.dayCheckedOut;
	}
	
	//Setters
	public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	public void setDayCheckedOut(int day) {
		this.dayCheckedOut = day;
	}
	

}
