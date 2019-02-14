//Leia 4 notas e apresente a média delas

package secao03;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4;
		double res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 4 notas para calcular a média: ");
		System.out.print("\nInsira a primeira nota: ");
		n1 = sc.nextFloat();
		System.out.print("Insira a segunda nota: ");
		n2 = sc.nextFloat();
		System.out.print("Insira a terceira nota: ");
		n3 = sc.nextFloat();
		System.out.print("Insira a quarta nota: ");
		n4 = sc.nextFloat();
		
		res = (n1+n2+n3+n4)/4;
	
		System.out.println("\nA média é de: " + res);
		
		sc.close();
	}

}
