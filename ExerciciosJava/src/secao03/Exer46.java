//46 faca um programa que leia um numero inteiro positivo de tres digitos
//(de 100 a 999).
//gere outro numero formado pelos digitos invertidos do numero lido.
//exemplo numLido = 123 numGerado = 321

package secao03;

import java.util.Scanner;

public class Exer46 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, u, d, c;
		  
		System.out.println("Digite um número inteiro de 3 digitos: ");
		a = sc.nextInt();  	
		
		u = a%10;
		a = a/10;
		d = a%10;
		c = a/10;
		
		System.out.print(u);
		System.out.print(d);
		System.out.print(c);
		
		sc.close();
	}		
}