package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class aula65 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		p.setName(sc.next());
		System.out.print("Price: ");
		p.setPrice(sc.nextDouble());
//		System.out.print("Quantity in stock: ");
//		p.quantity = sc.nextInt();
		
		//System.out.printf("%nProduct data: %s, $ %.2f, %d units, Total: $ %.2f%n", p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.println("\nProduct data: " + p);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		
		//System.out.printf("%nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f%n", p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.println("\nUpdated data: " + p);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		
		//System.out.printf("%nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f%n", p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.println("\nUpdated data: " + p);
		
		sc.close();

	}

}
