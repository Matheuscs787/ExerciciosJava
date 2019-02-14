//Leia uma velocidade em km/h e imprima ela em metro/seg

package secao03;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double km, m;
		
		System.out.println("\tCONVERSOR DE KM/H PARA M/S");
		System.out.print("\nQual a velocidade em km/h? ");
		km = sc.nextDouble();
		
		m = km/3.6;
		
		System.out.println("\nA sua velocidade em metros por segundo é de: " + m);
		
		sc.close();
	}

}
