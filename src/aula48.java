import java.util.Scanner;

public class aula48 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = 0;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			x = sc.nextInt();
			sum += x;
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
