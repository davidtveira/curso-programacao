import java.util.Locale;
import java.util.Scanner;

public class aula35ExResolvido2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double delta = (B * B) - (4 * A * C);

		if (A == 0 || delta < 0) {
			System.out.println("Impossível calcular");
		} else {
			double R1 = (-B + Math.sqrt(delta)) / (2 * A);
			double R2 = (-B - Math.sqrt(delta)) / (2 * A);

			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}

		sc.close();

	}

}
