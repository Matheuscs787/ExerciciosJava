//Leia um valor em jardas e o apresente em metros

package secao03;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double jar, m;
		
		System.out.println("\tConversor de jardas para metros");
		System.out.print("\nInsira o valor em jardas: ");
		jar = sc.nextDouble();
		
		m = jar*0.9144;
		
		System.out.println("Valor convertido em metros: " + m);
		
		sc.close();

	}

}
