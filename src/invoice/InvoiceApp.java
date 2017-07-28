package invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This is a program to produce accepts a tax rate and a list of 
		 * products (with prices and descriptions), and outputs an invoice.
		 * 
		 * @author Grace
		 **/
		String contin = null;
		double taxRate;
		double totalAmount = 0.0;
		double finalAmount = 0.0;
		double tax=0.0;
		ArrayList<Product> arr = new ArrayList<Product>();

		System.out.println("Input a product tax:");
		Scanner sctax = new Scanner(System.in);
		taxRate=sctax.nextDouble();
		
		do{
		
        // Create a new instance of Product as an item in ArrayList
		Product one = new Product();
        
		//Prompt user input for name
		System.out.println("Input a product name:");
		Scanner scname = new Scanner(System.in);
			
		String name = scname.nextLine();
		one.setName(name);

		//Prompt user input for description
		System.out.println("Input a product description:");
		Scanner scde = new Scanner(System.in);
			
		String des = scde.nextLine();
		one.setDescription(des);
		
		//Prompt user input for price
		System.out.println("Input a product price:");
		Scanner scpri = new Scanner(System.in);
		
		Double price = scpri.nextDouble();
		one.setPrice(price);
	    
		// prompt for choice of continue or not 
		System.out.println("Would you like to continue? y/n");
		Scanner scan = new Scanner(System.in);
		contin= scan.nextLine(); 
		
		//add this item in to the ArrayList
		arr.add(one);
		
		} while (contin.equalsIgnoreCase("y"));

		//print out the invoice
		System.out.println("Invoice");
		
		// Enhanced loop over the ArrayList arr, add each price to total amount
		for (Product item: arr) {
			totalAmount += item.getPrice(); 
			System.out.println(item.getName() + "    " + item.getDescription() + "    " + "$" + item.getPrice());

		}
		
		//Calculate totalAmount, tax and finalAmount
		tax = totalAmount * taxRate/100;
		finalAmount = totalAmount + tax; 
		
		//Print out the invoice, taxRate, tax (round to two decimal places)
		System.out.println("Total amount: $" + totalAmount);
		System.out.println("Tax rate: " + taxRate + "%");
		System.out.printf("Tax: $%.2f", tax);
		System.out.printf("\nFinal amount: $%.2f",finalAmount);
		//System.out.printf("Final amount: $"+Math.round(finalAmount,2));

	}
}

