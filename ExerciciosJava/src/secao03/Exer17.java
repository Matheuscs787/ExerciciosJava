//Leia um valor em cm e imprima ele em polegadas

package secao03;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pol, cm;
		
		System.out.println("\tConversor de centímetros para polegadas");
		System.out.print("\nInsira o valor em centímetros: ");
		cm = sc.nextDouble();
		
		pol = cm/2.54;
		
		System.out.println("O comprimento em polegadas é de: " + pol);
		
		sc.close();
	}

}
