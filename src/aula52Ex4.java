import java.util.Locale;
import java.util.Scanner;

public class aula52Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divisão impossível!");
			} else {
				double res = (double) x / y;
				System.out.printf("%.1f%n", res);
			}
		}

		sc.close();

	}

}
