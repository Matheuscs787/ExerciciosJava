//Faça um programa que leia um número real e o imprima

package secao03;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float valor;
		
		System.out.print("Insira um valor real: ");
		valor = sc.nextFloat();
		
		System.out.println("\nO valor inserido foi: " + valor);
	
		sc.close();
	}

}
