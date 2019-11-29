package application;

import java.util.Locale;
import java.util.Scanner;

public class aula87ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] v = new double[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextDouble();
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f%n", avg(v));
		
		sc.close();
	}
	
	public static double avg(double[] v) {
		double sum = 0;
		int count = v.length;
		for(int i = 0; i < v.length; i ++) {
			sum += v[i];
		}
		return sum/count;
	}
	
}
