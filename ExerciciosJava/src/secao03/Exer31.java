//Leia um numero inteiro e imprima o seu anterior e sucessor

package secao03;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.print("Insira o valor: ");
		valor = sc.nextInt();
		System.out.println("O valor digitado é: " + valor + "\nO seu anterior é: " + (valor-1) + "\nO seu sucessor é: " + (valor+1));		
		sc.close();
	}

}
