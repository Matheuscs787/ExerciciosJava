//Leia um valor em metros quadrados e aprensente ele em acres

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double mq, acre;
		DecimalFormat df = new DecimalFormat("0.000000");
		
		System.out.println("\tConversor de metros quadrados para acres");
		System.out.print("\nInsira o valor em metros quadrados: ");
		mq = sc.nextDouble();
		
		acre = mq*0.000247105;
		
		System.out.println("Valor convertido em acres: " + df.format(acre));
		
		sc.close();
	}

}
