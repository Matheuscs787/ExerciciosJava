//Leia um numero real
//se for positivo imprima a raiz quadrada
//se for negativo imprima o quadrado

package secao04;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Insira um número: ");
		x = sc.nextDouble();
		
		if(x>0) {
			System.out.print("A raíz quadrada de " + x + " é " + Math.sqrt(x));
		}
		else if(x<0){
			System.out.println(x + " elevado ao quadrado é " + (x*x));
		}
		else {
			System.out.println(x + " é neutro");
		}
		
		sc.close();
	}

}
