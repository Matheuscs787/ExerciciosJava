//faca um programa que leia um numero e
//caso ele seja positivo, calcule e mostre
//o quadrado desse numero
// a raiz quadrada dele

package secao04;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Insira um número: ");
		x = sc.nextDouble();
		
		if(x>0) {
			System.out.println(x + " elevado ao quadrado é " + (x*x));
			System.out.println("A raíz quadrada de " + x + " é " + Math.sqrt(x));
		}
		else {
			System.out.println("O número é menor ou igual a 0");
		}
		
		sc.close();
	}

}
