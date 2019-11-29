import java.util.Scanner;

public class aula52ExResolvido2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int sum = 0;

		if (x > y) {
			if (y % 2 != 0) {
				for (int i = y + 2; i < x; i += 2) {
					sum += i;
				}
			} else {
				for (int i = y + 1; i < x; i += 2) {
					sum += i;
				}
			}
			System.out.println(sum);

		} else if (x < y) {
			if (x % 2 != 0) {
				for (int i = x + 2; i < y; i += 2) {
					sum += i;
				}
			} else {
				for (int i = x + 1; i < y; i += 2) {
					sum += i;
				}
			}
			System.out.println(sum);
		} else {
			System.out.println(0);
		}

		sc.close();

	}

}
