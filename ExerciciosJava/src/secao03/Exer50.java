//50 implemente um programa que calcule o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.

package secao03;

import java.util.Scanner;

public class Exer50 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int idade, anoA, anoN;
		
		System.out.print("Qual sua idade atual? " + "\nOBS: Caso não tenha feito aniversário esse ano, coloque quantos anos vai completar\n");
		idade = sc.nextInt();
		System.out.print("Em qual ano estamos? ");
		anoA = sc.nextInt();
		
		anoN = anoA - idade;
		
		System.out.println("Você nasceu no ano de " + anoN);
		
		sc.close();
	}

}
