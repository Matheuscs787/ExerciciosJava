//Leia um valor em real e a cotação do dolar, apresente o valor em real convertido para dolar

package secao03;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double real, dolar, res;
		
		System.out.println("\tConversor de real para dolar");
		System.out.print("\nInsira o valor em real: ");
		real = sc.nextDouble();
		System.out.print("Insira a cotação do dolar: ");
		dolar = sc.nextDouble();
		res = real*dolar;
		
		System.out.println("O valor convertido em dolar é: " + res);
		sc.close();
	}

}
