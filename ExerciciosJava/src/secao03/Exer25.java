//Leia um valor em acres e apresente ele em metros quadrados

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double mq, acre;
		DecimalFormat df = new DecimalFormat("0.000000");
		
		System.out.println("\tConversor de acres para metros quadrados");
		System.out.print("\nInsira o valor em acres: ");
		acre = sc.nextDouble();
		
		mq = acre/0.000247105;
		
		System.out.println("Valor convertido em metros quadrados: " + df.format(mq));
		
		sc.close();
	}

}
