//53 faca um programa para ler as dimensoes de um terreno (comprimento c e largura l), 
//bem como o preco do metro de tela p.
//imprima o custo para cercar esse mesmo terreno com a tela	

package secao03;

import java.util.Scanner;

public class Exer53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double c, l, p, v;
		
		System.out.print("Qual o comprimento do terreno em metros? ");
		c = sc.nextDouble();
		System.out.print("Qual a largura do terreno em metros? ");
		l = sc.nextDouble();
		System.out.print("Qual o preço em reais do metro da tela? ");
		p = sc.nextDouble();
		
		v = (c*2)+(l*2);
		p = p*v;
		
		System.out.println("Quantidade de cerca necessaria para cercar o terreno: " + v + " metros");
		System.out.println("O valor gasto vai ser de: R$" + p);
		
		sc.close();
	}

}
