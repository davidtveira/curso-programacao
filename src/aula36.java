import java.util.Locale;
import java.util.Scanner;

public class aula36 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		if (minutos <= 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		} else {
			double valor = 50.00 + 2.00 * (minutos - 100);
			System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		}

		sc.close();

	}

}
