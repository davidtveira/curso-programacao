package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class aula68Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		s.name = sc.nextLine();
		s.nota1 = sc.nextDouble();
		s.nota2 = sc.nextDouble();
		s.nota3 = sc.nextDouble();

		System.out.println(s);

		if (s.finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", (60.0 - s.finalGrade())) + " POINTS");
		}

		sc.close();

	}

}
