

import java.util.Scanner;

public class aula59 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int maior = max(x, y, z);

		showResult(maior);

		sc.close();

	}

	public static int max(int a, int b, int c) {

		int maior = a;

		if (maior <= b) {
			maior = b;
		} else if (maior <= c) {
			maior = c;
		}

		return maior;
	}

	public static void showResult(int a) {
		System.out.printf("Higher = %d%n", a);
	}

}
