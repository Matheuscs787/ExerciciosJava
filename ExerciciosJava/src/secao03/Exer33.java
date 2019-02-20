//Leia o tamanho de um lado do quadrado e imprima sua area

package secao03;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float lado;
		
		System.out.print("Insira o tamanho de um lado do quadrado: ");
		lado = sc.nextFloat();
		
		lado = lado*lado;
		
		System.out.println("A area do quadrado é: " + lado);
		
		sc.close();
	}

}
