package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class aula69ex1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
		System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		sc.close();

	}

}
