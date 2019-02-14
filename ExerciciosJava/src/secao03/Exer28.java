//Faça a leitura de 3 valores e apresente a soma dos quadrados desses valores

package secao03;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		float v1, v2, v3;
		double res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tSoma do quadrado de 3 valores");
		System.out.print("\nInsira o primeiro valor: ");
		v1 = sc.nextFloat();
		System.out.print("Insira o segundo valor: ");
		v2 = sc.nextFloat();
		System.out.print("Insira o terceiro valor: ");
		v3 = sc.nextFloat();
		
		res = (v1*v1)+(v2*v2)+(v3*v3);
		
		System.out.println("\nA soma dos quadrados é: " + res);
		
		sc.close();
	}

}
