import java.util.Scanner;

public class aula47Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;

		while (val != 4) {

			switch (val) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			default:
				break;
			}

			val = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
