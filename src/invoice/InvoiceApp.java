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
		double taxRate = 0.0;
		double totalAmount = 0.0;
		double finalAmount = 0.0;
		double tax=0.0;
		ArrayList<Product> arr = new ArrayList<Product>();

		
		System.out.println(" ===This is an Invoice App===" + "\n");
		System.out.println("Please enter the tax rate (%): ");
		Scanner sctax = new Scanner(System.in);
		taxRate=sctax.nextDouble();
		
		do{
		
        // Create a new instance of Product as an item in ArrayList
		Product one = new Product();
        
		//Prompt user input for name
		System.out.println("Please enter the product name:");
		Scanner scname = new Scanner(System.in);
			
		String name = scname.nextLine();
		one.setName(name);

		//Prompt user input for description
		System.out.println("Please enter a description:");
		Scanner scde = new Scanner(System.in);
			
		String des = scde.nextLine();
		one.setDescription(des);
		
		//Prompt user input for price
		System.out.println("Please enter the product price:");
		Scanner scpri = new Scanner(System.in);
		
		Double price = scpri.nextDouble();
		one.setPrice(price);
	    
		// prompt for choice of continue or not 
		System.out.println("\nWould you like to enter another product? y/n");
		Scanner scan = new Scanner(System.in);
		contin= scan.nextLine(); 
		
		//add this item in to the ArrayList
		arr.add(one);
		
		} while (contin.equalsIgnoreCase("y"));

		//print out the invoice
		System.out.println("================================================");
		System.out.println("                Your   Invoice                  ");
		System.out.println("================================================");
		
		//System.out.printf("%10%13s%17s", "Name", "DESCRIPTION", "PRICE");
		System.out.printf("%12s%16s%16s", "ITEM", "DESCRIPTION", "PRICE");
		System.out.println("\n-------------------------------------------------");
		
		// Enhanced loop over the ArrayList arr, add each price to total amount
		for (Product item: arr) {
			totalAmount += item.getPrice(); 
			System.out.printf("%-19s%-9s%17s", item.getName(),item.getDescription(),
					"$"+item.getPrice()+"\n");

		}
		
		//Calculate totalAmount, tax and finalAmount
		tax = totalAmount * taxRate/100;
		finalAmount = totalAmount + tax; 
		
		
		//Print out the invoice, taxRate, tax (round to two decimal places)
		System.out.println("\n-------------------------------------------------");		
		System.out.println("Total Amount: $" + totalAmount);
		System.out.println("Tax Rate: " + taxRate + "%");
		System.out.printf("Tax: $%.2f", tax);
		System.out.printf("\nFinal Amount with Tax: $%.2f",finalAmount);
		//System.out.printf("Final Amount with Tax: $"+Math.round(finalAmount,2));

	}
}

/*Test Result
 * 

===This is an Invoice App===

Please enter the tax rate (%): 
5.5
Please enter the product name:
Chips
Please enter a description:
Snack
Please enter the product price:
3.50

Would you like to enter another product? y/n
y
Please enter the product name:
Game of Thrones
Please enter a description:
DVD
Please enter the product price:
38.99

Would you like to enter another product? y/n
n


================================================
               Your   Invoice                  
================================================
       ITEM     DESCRIPTION           PRICE
-------------------------------------------------
Chips              Snack                $3.5
Game of Thrones    DVD                $38.99

-------------------------------------------------
Total Amount: $42.49
Tax Rate: 5.5%
Tax: $2.34
Final Amount with Tax: $44.83


 */