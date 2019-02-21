//Leia um numero fornecido pelo usuario
//se ele for positivo calcule a raiz quadrada
//se for negativo mostre uma mensagem dizendo que o numero é invalido

package secao04;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Insira um valor: ");
		x = sc.nextDouble();
		
		if(x>0) {
			System.out.println("A raíz quadrada de " + x + " é: " + Math.sqrt(x));
		}
		else {
			System.out.println("Número invalido");
		}
		
		sc.close();
	}

}
