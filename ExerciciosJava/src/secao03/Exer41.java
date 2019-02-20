//faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas trabalhadas no mes.
//imprima o valor a ser pago ao funcionario, adicionando 10% sobre o valor calculado.

package secao03;

import java.util.Scanner;

public class Exer41 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double vh, ht, aumento, valor;
		
		System.out.print("Insira o valor da hora de trabalho em reais: R$");
		vh = sc.nextDouble();
		System.out.print("Insira a quantidade de horas trabalhadas: ");
		ht = sc.nextDouble();
		
		valor = vh*ht;
		
		System.out.println("\nValor sem aumento é de: R$" + valor);
		
		aumento = 10*valor/100;
		valor = valor + aumento;
		
		System.out.println("Valor com aumento é de: R$" + valor);
		System.out.println("O aumento foi de: R$" + aumento);
		
		sc.close();
	}

}
