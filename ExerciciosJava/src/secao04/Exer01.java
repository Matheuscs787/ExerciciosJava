//faca um programa que receba 2 valores
//mostre o maior deles

package secao04;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a, b;
		
		System.out.print("Insira o primeiro valor: ");
		a = sc.nextDouble();
		System.out.print("Insira o segundo valor: ");
		b = sc.nextDouble();
		
		if(a>b) {
			System.out.println("O maior valor é: " + a);
		}
		else {
			System.out.println("O maior valor é: " + b);
		}
		
		sc.close();
	}
}
