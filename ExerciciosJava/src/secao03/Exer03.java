//Peça ao usuário que insira 3 números inteiros e imprima a soma deles

package secao03;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3, soma;
		
		System.out.print("Insira o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Insira o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.print("Insira o terceiro valor: ");
		valor3 = sc.nextInt();
		
		soma = valor1 + valor2 + valor3;
		
		System.out.println("\nO resultado da soma é: " + soma);
		
		sc.close();
	}
}
