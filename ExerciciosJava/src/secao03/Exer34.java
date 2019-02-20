//Leia o valor do raio de um circulo, calcule e imprima sua area

package secao03;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double raio, area;
		
		System.out.print("Insira o raio do circulo: ");
		raio = sc.nextFloat();
		area = 3.141592*(raio*raio);
		
		System.out.println("A área do quadrado é: " + area);
		sc.close();
	}

}
