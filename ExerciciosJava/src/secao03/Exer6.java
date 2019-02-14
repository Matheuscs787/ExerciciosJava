//Leia uma temperatura em Celsius e apresente ela em Fahrenheit

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double fah, cel;
		
		System.out.println("\tCONVERSOR DE CELSIUS PARA FAHRENHEIT");
		System.out.print("\nQual a temperatura em Celsius? ");
		cel = sc.nextDouble();
		fah = cel*(9.0/5.0)+32.0;
		System.out.println("A temperatura em Fahrenheit é: " + df.format(fah));

		sc.close();
	}

}