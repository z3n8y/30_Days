package day_11_2d_array;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
	
	Map<String,Book> bookCollection = new HashMap<String,Book>();
	int currentDay = 0;
	int lengthOfCheckoutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;
	
	
	public LibraryCatalogue(Map<String,Book> collection) {
		// TODO Auto-generated constructor stub
		this.bookCollection = collection;
	}
	
	public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod, 
			double intialLateFee, double feePerLateDay) {
		// TODO Auto-generated constructor stub
		this.bookCollection = collection;
		this.lengthOfCheckoutPeriod= lengthOfCheckoutPeriod;
		this.initialLateFee = intialLateFee;
		this.feePerLateDay = feePerLateDay;
	}
	
	//INSTANCE METHODS
	public Map<String,Book> getBookCollection(){ 
		return this.bookCollection;
	}
	
	public int getCurrentDay() {
		return this.currentDay;
	}
	
	public Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}
	
	public int getLengthOfCheckoutPeriod() {
		return this.lengthOfCheckoutPeriod;
	}
	
	public double getInitialLateFee() {
		return this.initialLateFee;
	}
	
	public double getFeePerLateDay() {
		return this.feePerLateDay;
	}

	//SETTERS
	public void nextDay() {
		currentDay ++;
	}
	
	public void setDay(int day) {
		currentDay = day;
	}
	
	
	// INSTANCE METHODS CONT.
	public void checkOutBook(String title) {
		Book book = getBook(title);
		if (book.getIsCheckedOut()) {
			sorryBookAlreadyCheckedOut(book);
		} else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out " + title + ". it is due on day "+
			(getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
		}
	}
	
	public void returnBook(String title) {
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
		if (daysLate > 0) {
			System.out.println("You owe the library $" + (getInitialLateFee() + daysLate + getFeePerLateDay()) + 
					" because your book is " + daysLate + " days overdue.");		
		} else {
			System.out.println("Book Returned. Thank you!");
		}
		book.setIsCheckedOut(false, -1);
	}
	
	public void sorryBookAlreadyCheckedOut(Book book) {
		System.out.println("Sorry, " + book.getTitle() + " is already checked out. " + 
				"It should be back on day " + (book.getDayCheckedOut() + 
						getLengthOfCheckoutPeriod()) + ".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Book> bookCollection = new HashMap<String,Book>();
		Book harry = new Book("Harry Potter and the Sorcerer's Stone", 309, 7475);
		bookCollection.put("Harry Potter and the Sorcerer's Stone", harry);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		
		lib.checkOutBook("Harry Potter and the Sorcerer's Stone");
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter and the Sorcerer's Stone");
		lib.setDay(17);
		lib.returnBook("Harry Potter and the Sorcerer's Stone");
		lib.checkOutBook("Harry Potter and the Sorcerer's Stone");
	}

}
