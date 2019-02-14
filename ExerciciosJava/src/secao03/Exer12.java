//Leia uma distancia em milhas e apresente em km

package secao03;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double milha, km;
		System.out.println("\tCONVERSOR DE MILHAS PARA KM");
		System.out.print("\nInsira a distância em milhas: ");
		milha = sc.nextDouble();
		
		km = 1.61*milha;
		
		System.out.println("A distância em km é de: " + km);
		
		sc.close();
	}

}
