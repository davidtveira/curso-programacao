import java.util.Locale;
import java.util.Scanner;

public class aula35Ex5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double val;
		
		if(codigo == 1) {
			val = 4.00;
		} else if(codigo == 2) {
			val = 4.50;
		} else if(codigo == 3) {
			val = 5.00;
		} else if(codigo == 4) {
			val = 2.00;
		} else if(codigo == 5) {
			val = 1.50;
		} else {
			throw new IllegalStateException("Valor inválido");
		}
		
		double total = val * quantidade;
		
		System.out.printf("Total : R$ %.2f%n" ,total);
		
		sc.close();

	}

}
