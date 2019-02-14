//Leia um angulo em graus e imprima em radianos 

package secao03;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double grau, radiano;
		
		System.out.println("\tCONVERSOR DE ANGULO EM GRAUS PARA RADIANOS");
		System.out.print("\nInsira o angulo em graus: ");
		grau = sc.nextDouble();
		
		radiano = grau*3.1416/180;
		
		System.out.println("O angulo em radianos é de: " + radiano);
		
		sc.close();
	}

}
