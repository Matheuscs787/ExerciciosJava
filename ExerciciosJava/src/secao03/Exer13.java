//Leia uma distância em km e apresente em milhas

package secao03;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double milha, km;
		System.out.println("\tCONVERSOR DE KM PARA MILHAS");
		System.out.print("\nInsira a distância em km: ");
		km = sc.nextDouble();

		milha = km/1.61;

		System.out.println("A distância em milhas é de: " + milha);

		sc.close();
	}

}
