//Leia um angulo em radianos e imprima em graus

package secao03;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double grau, radiano;
		
		System.out.println("\tCONVERSOR DE ANGULO EM RADIANOS PARA GRAUS");
		System.out.print("\nInsira o angulo em radianos: ");
		radiano = sc.nextDouble();
		
		grau = radiano*180/3.1416;
		
		System.out.println("O angulo em graus é de: " + grau);
		
		sc.close();
	}

}
