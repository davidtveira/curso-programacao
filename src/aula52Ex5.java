import java.util.Scanner;

public class aula52Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int factorial = n;
		if (n == 0) {
			System.out.println(0);
		} else {
			for (int i = n - 1; i > 0; i--) {
				factorial *= i;
			}
		}

		if (n != 0) {
			System.out.println(factorial);
		}

		sc.close();

	}

}
