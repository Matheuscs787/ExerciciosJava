//Leia um valor em hectares e apresente ele em metros quadrados

package secao03;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double mq, hec;
		
		System.out.println("\tConversor de hectares para metros quadrados");
		System.out.print("\nInsira o valor em hectares: ");
		hec = sc.nextDouble();
		
		mq = hec*10000;
		
		System.out.println("Valor convertido em metros quadrados: " + mq);
		
		sc.close();
	}

}
