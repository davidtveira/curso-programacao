import java.util.Scanner;

public class aula52Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x < 1 || x > 1000) {
			System.out.println("Out of bounds, try another number between 1 and 1000");
			x = sc.nextInt();
		}

		if (x % 2 != 0) {
			for (int i = 1; i <= x; i += 2) {
				System.out.println(i);
			}
		} else {
			for (int i = 1; i < x; i += 2) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
