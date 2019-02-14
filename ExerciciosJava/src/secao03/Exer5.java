//Leia um número real e imprima a quinta parte dele

package secao03;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float valor;
		
		System.out.println("Insira um valor real: ");
		valor = sc.nextFloat();
		System.out.println("A quinta parte desse valor é: " + (valor/5));
		sc.close();
	}

}
