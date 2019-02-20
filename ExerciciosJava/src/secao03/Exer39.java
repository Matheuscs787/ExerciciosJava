//a importancia de R$780.000,00 sera dividida em tres ganhadores de um concurso, sendo que da quantia total
//> o primeiro ganhador recebera 46%
//> o segundo ganhador recebera 32%
//> o terceiro recebera o restante;
//calcule e imprima a quantia ganha por cada um dos ganhadores

package secao03;

import java.util.Scanner;

public class Exer39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor = 780000;
		double g1, g2, g3;
		
		g1 = 46*valor/100;
		g2 = 32*valor/100;
		g3 = valor-g1-g2;
		
		System.out.println("Valor do premio total: R$" + valor + "\n");
		System.out.println("O ganhador 1 recebera: R$" + g1);
		System.out.println("O ganhador 2 recebera: R$" + g2);
		System.out.println("O ganhador 3 recebera: R$" + g3);
		
		sc.close();
	}

}
