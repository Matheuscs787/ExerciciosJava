//Receba a temperatura em celsius e imprima em kelvin

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double cel, kel;
		
		System.out.println("\tCONVERSOR DE CELSIUS PARA KELVIN");
		System.out.print("\nQual a temperatura em Celsius? ");
		cel = sc.nextDouble();
		kel = cel + 273.15;
		System.out.println("A temperatura em Kelvin é: " + df.format(kel));

		sc.close();
	}
}