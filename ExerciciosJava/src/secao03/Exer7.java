//Leia uma temperatura em Fahrenheit e apresente ela em Celsius

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer7 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double cel, fah;
		
		System.out.println("\tCONVERSOR DE FAHRENHEIT PARA CELSIUS");
		System.out.print("\nQual a temperatura em Fahrenheit? ");
		fah = sc.nextDouble();
		cel = 5.0*(fah-32.0)/9.0;
		System.out.println("A temperatura em Celsius é: " + df.format(cel));

		sc.close();
	}
}
