//Leia de um valor de massa em kg e apresente ele em libras

package secao03;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double kg, libra;
		
		System.out.println("\tConversor de kg para libras");
		System.out.print("\nInsira o valor em kg: ");
		kg = sc.nextDouble();
		
		libra = kg*2.2046;
		
		System.out.println("Valor convertido em libras: " + libra);
		
		sc.close();
	}

}
