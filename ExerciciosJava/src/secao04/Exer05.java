//faca um programa que receba um numero inteiro
//e verifique se este numero é par ou impar

package secao04;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Insira um número: ");
		x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("O número " + x + " é par");
		}
		else {
			System.out.println("O número " + x + " é ímpar");
		}
		
		sc.close();
	}
}