//faca um programa que receba dois valores e mostre o maior
//se forem iguais mostre uma mensagem falando que sao iguais

package secao04;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.print("Insira o primeiro valor: ");
		x = sc.nextDouble();
		System.out.print("Insira o segundo valor: ");
		y = sc.nextDouble();
		
		if(x>y) {
			System.out.println(x + " é maior que " + y);
			x -=y;
			System.out.println("A diferença é de " + x);
		}
		else if(x<y) {
			System.out.println(y + " é maior que " + x);
			y -=x;
			System.out.println("A diferença é de " + y);
		}
		else {
			System.out.println("Os dois números são iguais");
		}
		sc.close();
	}
}