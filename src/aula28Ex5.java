import java.util.Locale;
import java.util.Scanner;

public class aula28Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		int id1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valUnit1 = sc.nextDouble();
		
		@SuppressWarnings("unused")
		int id2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valUnit2 = sc.nextDouble();
		
		double total = quantidade1 * valUnit1 + quantidade2 * valUnit2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();

	}

}
