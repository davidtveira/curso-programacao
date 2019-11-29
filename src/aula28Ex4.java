import java.util.Locale;
import java.util.Scanner;

public class aula28Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nFuncionario = sc.nextInt();
		int hTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();

		double salario = hTrabalhadas * valorHora;

		System.out.println("NUMBER = " + nFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
