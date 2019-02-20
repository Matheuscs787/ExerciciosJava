//45 faca um programa para converter uma string maiuscula em minuscula.

package secao03;

import java.util.Scanner;

public class Exer45 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Insira uma letra: ");
		letra = sc.next();
		
		System.out.println(letra.toLowerCase());
		
		sc.close();
	}
}
