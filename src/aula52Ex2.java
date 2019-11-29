import java.util.Scanner;

public class aula52Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int in = 0, out = 0;

		for (int i = 0; i < x; i++) {
			int v = sc.nextInt();
			if (v >= 10 && v <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.printf("%d in%n%d out%n", in, out);

		sc.close();

	}

}
