import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_2_Operators {
	double meal_cost;
	int tip_percent;
	int tax_percent; 
	
	public Day_2_Operators(double cost, int tipPercent, int taxPercent) {
		// TODO Auto-generated constructor stub
		meal_cost = cost;
		tip_percent = tipPercent;
		tax_percent = taxPercent;		
	}
	
	public double calculateTip() {
		//Calculates the tip
		return  meal_cost * tip_percent / 100;
	}
	
	public double calculateTax() {
		//Calculates the tax
		return meal_cost * tax_percent / 100;
	}
	
	public double getTotal() {
		//Adds the tip and the tax to the Total		 
		return meal_cost + calculateTip() + calculateTax();
	}
	
	static void solve(double total) {
		System.out.println((int) Math.round(total));
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //For Production
		//double cost = scanner.nextDouble();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //int tipPercent = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //int taxPercent = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");		
		//Day_2_Operators theBill = new Day_2_Operators(cost, tipPercent, taxPercent);	
		
		        //For testing
		Day_2_Operators theBill = new Day_2_Operators(12.00, 20, 8);
		
		//MAIN
		double total = theBill.getTotal();		
		solve(total);              
        scanner.close();
	}

}
