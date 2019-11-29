package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class aula89 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Estudante[] v = new Estudante[10];
		
		for(int i = 0; i < n; i++) {
			int num = i+1;
			System.out.printf("\nRent #%d:%n", num);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			v[room] = new Estudante(name, email);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i = 0; i < v.length; i ++) {
			if(v[i] == null) {
				continue;
			} else {
				System.out.printf("%d: %s, %s%n", i, v[i].getName(), v[i].getEmail());
			}
		}
		
		
		sc.close();

	}

}
