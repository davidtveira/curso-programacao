import java.util.Scanner;

public class aula35Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B) {
			if (A % B == 0) {
				System.out.println("S�o m�ltiplos!");
			} else {
				System.out.println("N�o s�o m�ltiplos");
			}
		} else if (A <= B) {
			if (B % A == 0) {
				System.out.println("S�o m�ltiplos!");
			} else {
				System.out.println("N�o s�o m�ltiplos");
			}
		}

		sc.close();
	}

}
