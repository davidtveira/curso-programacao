package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product88;

public class aula88ex1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product88[] v = new Product88[n];

		for (int i = 0; i < v.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			v[i] = new Product88(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i].getPrice();
		}
		double avg = sum / v.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();
	}
}
