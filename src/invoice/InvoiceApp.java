package invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contin = null;
		double taxRate;
		double totalAmount = 0.0;
		double finalAmount = 0.0;
		double tax=0.0;
		ArrayList<Product> arr = new ArrayList<Product>();

		System.out.println("Input a product tax:");
		Scanner scprice = new Scanner(System.in);
		taxRate=scprice.nextDouble();
		System.out.println(taxRate);
		
		do{
		
		Product one = new Product();

		System.out.println("Input a product name:");
		Scanner scname = new Scanner(System.in);
			
		String name = scname.nextLine();
		one.setName(name);
		System.out.println(one.getName());

		System.out.println("Input a product price:");
		Scanner scpri = new Scanner(System.in);
		
		Double price = scpri.nextDouble();
		one.setPrice(price);
		System.out.println(one.getPrice());
	
		System.out.println("Would you like to continue? y/n");
		Scanner scan = new Scanner(System.in);
		contin= scan.nextLine(); 
		
		arr.add(one);
		
		} while (contin.equalsIgnoreCase("y"));
		
		// arr.addProduct();

		System.out.println("Invoice");
		
		for (Product item: arr) {
			totalAmount += item.getPrice(); 
			System.out.println(item.getName() + "   " + item.getPrice());

		}
		
		tax = totalAmount * taxRate/100;
		finalAmount = totalAmount + tax; 
		
		System.out.println(totalAmount);
		System.out.println(tax);
		System.out.println(finalAmount);

	}
}

