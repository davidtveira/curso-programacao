import java.util.Scanner;

public class aula35Ex4_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		int duracao;
		
		if(A < B) {
			duracao = B - A;
		} else {
			duracao = 24 - A + B;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
