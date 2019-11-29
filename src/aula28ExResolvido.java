import java.util.Locale;
import java.util.Scanner;

public class aula28ExResolvido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = sc.nextDouble();
		
		double area = largura*comprimento;
		double preco = area*metroQuadrado;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc.close();
		
	}
	
}
