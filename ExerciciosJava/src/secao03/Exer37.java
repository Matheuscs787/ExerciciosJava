//faca um programa que leia o valor de um prodruto e imprima o valor com desconto,
//tendo em vista que o desconto foi de 12%

package secao03;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double valor;
		double desconto;
		
		System.out.print("Insira o valor do produto: R$");
		valor = sc.nextDouble();
		
		desconto = 12*valor/100;
		valor = valor - desconto; 
		
		System.out.println("O valor com desconto é de: R$" + valor);
		System.out.println("O desconto foi de: R$" + desconto);
		
		sc.close();
	}

}
