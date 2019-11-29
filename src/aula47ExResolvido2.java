import java.util.Locale;
import java.util.Scanner;

public class aula47ExResolvido2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int count = 0;
		int sum = 0;

		if (x < 0) {
			System.out.println("Impossível calcular");
		}

		while (x >= 0) {
			count++;
			sum += x;
			x = sc.nextInt();
		}

		double avg = (double) sum / count;

		if (count > 0) {
			System.out.printf("%.2f%n", avg);
		}
		sc.close();

	}

}
