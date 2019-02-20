//47 leia um numero inteiro de 4 digitos (de 1000 a 9999) e imprima 1 digito por linha.

package secao03;

import java.util.Scanner;

public class Exer47 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Insira um valor entre 1000 e 9999");
		valor = sc.nextInt();
		
		if(valor>=1000 && valor<=9999) {
			char[] caracteres = Integer.toString(valor).toCharArray(); //converte o inteiro para uma sequência de caracteres
			for (char unidade : caracteres) {
			    System.out.println(unidade);
			}
		}		
		sc.close();
	}
}