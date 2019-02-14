//Faça um programa que leia um número inteiro e o imprima

package secao03;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Insira um valor inteiro: ");
		valor = sc.nextInt();
		
		System.out.println("\nO valor inserido foi: " + valor);
	
		sc.close();
	}
}
