//Leia um valor em metros e apresente ele em jardas	

package secao03;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double jar, m;
		
		System.out.println("\tConversor de metros para jardas");
		System.out.print("\nInsira o valor em metros: ");
		m = sc.nextDouble();
		
		jar = m/0.9144;
		
		System.out.println("Valor convertido em jardas: " + jar);
		
		sc.close();

	}

}
