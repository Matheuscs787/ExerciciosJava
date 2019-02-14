//Leia um valor em libras e apresente em kg

package secao03;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double kg, libra;
		
		System.out.println("\tConversor de libras para kg");
		System.out.print("\nInsira o valor em libras: ");
		libra = sc.nextDouble();
		
		kg = libra/2.2046;
		
		System.out.println("Valor convertido em kg: " + kg);
		
		sc.close();
	}

}
