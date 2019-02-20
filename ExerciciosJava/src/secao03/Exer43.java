//	43 escreva um programa de ajuda para vendedores.
//a partir de um valor total lido, mostre:
//> o total a pagar a vista com desconto de 10%
//> o valor de cada parcela, no parcelamento de 3x sem juros
//> a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
//> a comissao do vendedor, no caso da venda ser parcelada(5% sobre o valor total) 


package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double valor, valorDD, valorPT, comV, comP;
		
		System.out.print("Qual o valor do produto: R$");
		valor = sc.nextDouble();
		
		valorDD = 0.10*valor;
		valorDD = valor - valorDD;
		System.out.println("Valor para pagamento a vista: R$" + df.format(valorDD));
		valorPT = valor/3;
		System.out.println("O valor de cada parcela no pagamento em 3x sem juros é de: R$" + df.format(valorPT));
		comV = 0.05*valorDD;
		System.out.println("A comissão do vendedor para venda a vista é de: R$" + df.format(comV));
		comP = 0.05*valor;
		System.out.println("A comissão do vendedor para venda parcelada é de: R$" + df.format(comP));
		
		sc.close();
	}

}
