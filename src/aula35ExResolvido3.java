import java.util.Scanner;

public class aula35ExResolvido3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int menor = a;

		if (b <= a) {
			menor = b;
		} else if (c <= a) {
			menor = c;
		}

		System.out.println("MENOR = " + menor);

		sc.close();

	}

}