package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class aula94_ {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\nEmployee #%d:%n", i);
			System.out.print("Id: ");
			sc.nextLine();
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			funcionarios.add(new Funcionario(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have a salary increase: ");
		int idIncrease = sc.nextInt();
		Funcionario f = funcionarios.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		if (f == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			f.increaseSalary(percentage);
		}

		System.out.println("\nList of employees:");
		for (Funcionario func : funcionarios) {
			System.out.println(func);
		}

		sc.close();

	}

}
