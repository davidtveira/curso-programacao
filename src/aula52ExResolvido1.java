import java.util.Scanner;

public class aula52ExResolvido1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		while (2 > N || N > 1000) {
			System.out.println("Out of bounds, try another number between 2 and 1000");
			N = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			int n = i + 1;
			int res = n * N;
			System.out.printf("%d x %d = %d%n", n, N, res);
		}

		sc.close();

	}

}
