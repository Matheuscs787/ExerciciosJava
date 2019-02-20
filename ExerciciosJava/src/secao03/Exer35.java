//sejam a e b os catetos de um triangulo, 
//onde a hipotenusa é obtida pela equacao: hipotenusa = raiz quadrada de a²+b².
//Faca um programa que receba os valores de a e b 
//e calcule o valor da hipotenusa atraves da equacao.
//Imprima o resultado dessa operacao;

package secao03;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		float a, b;
		double h;
		
		System.out.print("Insira o valor do cateto a: ");
		a = sc.nextFloat();
		System.out.print("Insira o valor do cateto b: ");
		b = sc.nextFloat();
		
		h = Math.sqrt((a*a)+(b*b));
		
		System.out.println("A hipotenusa é: " + h);
		sc.close();
	}

}
