import java.util.Scanner;

public class aula35Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}
		
		sc.close();

	}

}
