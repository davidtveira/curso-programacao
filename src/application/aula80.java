package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class aula80 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount ba = null;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		double deposit = 0.0;

		while (!(answer == 'y') && !(answer == 'n')) {
			System.out.print("Invalid answer, please type a valid one (y/n): ");
			answer = sc.next().charAt(0);
		}
		if (answer == 'y') {
			System.out.print("Enter initial value: ");
			deposit = sc.nextDouble();
			ba = new BankAccount(number, name, deposit);
		} else if (answer == 'n') {
			ba = new BankAccount(number, name);
		}

		System.out.println("\nAccount data: ");
		System.out.println(ba);

		System.out.print("\nEnter a deposit value: ");
		ba.deposit(sc.nextDouble());

		System.out.println("Updated account data: ");
		System.out.println(ba);

		System.out.print("\nEnter a withdraw value: ");
		ba.withdraw(sc.nextDouble());

		System.out.println("Updated account data: ");
		System.out.println(ba);

		sc.close();
	}
}
