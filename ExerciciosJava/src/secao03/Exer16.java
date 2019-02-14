//Leia um valor em polegadas e imprima ele em cm

package secao03;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pol, cm;
		
		System.out.println("\tConversor de polegadas para centímetros");
		System.out.print("\nInsira o valor em polegadas: ");
		pol = sc.nextDouble();
		
		cm = pol*2.54;
		
		System.out.println("O comprimento em centímetros é de: " + cm);
		
		sc.close();
	}

}
