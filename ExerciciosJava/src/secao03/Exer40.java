//Uma empresa contrata um encanador a R$30,00 por dia.
//faca um programa que solicite o numero de dias trabalhados pelo encanador 
//e imprima a quantia liquida que devera ser paga, sabendo que sao descontados 8% para o imposto de renda

package secao03;

import java.util.Scanner;

public class Exer40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia;
		double valor, desc;
		
		System.out.print("Quantos dias o encanador trabalhou? ");
		dia = sc.nextInt();
		valor = 30*dia;
		System.out.println("O valor sem desconto é de: R$" + valor);
		desc = 8*valor/100;
		valor = valor - desc;
		System.out.println("O valor com desconto é de: R$" + valor);
		System.out.println("O desconto foi de: R$" + desc);
		
		sc.close();
	}

}
