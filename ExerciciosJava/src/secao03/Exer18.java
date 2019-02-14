//Leia um valor de volume em metros cubicos e apresente em litros

package secao03;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double mc, l;
		
		System.out.println("\tConversor de metros cúbicos para litros");
		System.out.print("\nInsira o valor em metros cúbicos: ");
		mc = sc.nextDouble();
		
		l = mc*1000;
		
		System.out.println("O volume em litros é de: " + l);
		
		sc.close();
	}

}
