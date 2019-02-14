//Leia um valor em metros quadrados e apresente ele em hectares

package secao03;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double mq, hec;
		
		System.out.println("\tConversor de metros quadrados para hectares");
		System.out.print("\nInsira o valor em metros quadrados: ");
		mq = sc.nextDouble();
		
		hec = mq*0.0001;
		
		System.out.println("Valor convertido em acres: " + hec);
		
		sc.close();
	}

}
