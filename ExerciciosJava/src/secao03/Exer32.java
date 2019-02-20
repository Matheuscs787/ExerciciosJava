//Leia um numero inteiro e imprima a soma do sucessor do seu triplo com o antecessor do seu dobro

package secao03;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.print("Insira o valor: ");
		valor = sc.nextInt();
		
		valor = (valor*3+1)+(valor*2-1);
		
		System.out.println("A soma é: " + valor);
		
		sc.close();
	}

}
