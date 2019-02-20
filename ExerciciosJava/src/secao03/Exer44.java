//44 receba a altura do degrau de uma escada 
//e a altura que o usuario deseja alcancar subindo a escada.
//calcule e mostre quantos degraus o usuario devera subir para atingir seu objetivo.

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer44 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		double altD, altS, deg;
		
		System.out.println("Qual a altura de um degrau em cm?");
		altD = sc.nextDouble();
		System.out.println("Qual a altura que você quer subir em cm?");
		altS = sc.nextDouble();
		
		deg = altS/altD;
		if(altS%altD == 0) {
			System.out.println("A quantidade de degraus necessários é: " + deg);
		}
		else if(altS%altD >= 0.5){
			deg = deg+1;
			System.out.println("A quantidade de degraus necessários é: " + df.format(deg));
		}
		
		sc.close();
	}

}
