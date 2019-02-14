//Leia a velocidade em m/s e apresente ela em km/h

package secao03;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double km, m;
		
		System.out.println("\tCONVERSOR DE M/S PARA KM/H");
		System.out.print("\nQual a velocidade em metros por segundo? ");
		m = sc.nextDouble();
		
		km = m*3.6;
		
		System.out.println("\nA sua velocidade em km/h é de: " + km);
		
		sc.close();
	}

}
