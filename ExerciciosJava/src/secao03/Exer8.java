//Receba a temperatura em kelvin e imprima em celsius

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double cel, kel;
		
		System.out.println("\tCONVERSOR DE KELVIN PARA CELSIUS");
		System.out.print("\nQual a temperatura em Kelvin? ");
		kel = sc.nextDouble();
		cel = kel - 273.15;
		System.out.println("A temperatura em Celsius é: " + df.format(cel));

		sc.close();
	}

}