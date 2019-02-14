//Leia um valor em litros e apresente ele em metros cúbicos

package secao03;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double mc, l;
		
		System.out.println("\tConversor de litros para metros cúbicos");
		System.out.print("\nInsira o valor em litros: ");
		l = sc.nextDouble();
		
		mc = l/1000;
		
		System.out.println("O volume em litros é de: " + mc);
		
		sc.close();
	}

}
