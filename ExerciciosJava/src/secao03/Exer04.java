//Leia um número real e imprima o resultado do quadrado desse número

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float valor;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira um valor real: ");
		valor = sc.nextFloat();
		System.out.println("O quadrado desse valor é: " + df.format((valor*valor)));
		
		sc.close();
	}

}
