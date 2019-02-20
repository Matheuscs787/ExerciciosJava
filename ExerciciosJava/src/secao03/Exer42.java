//42 receba o salario base de um funcionario.
//calcule e imprima o salario a receber, 
//sabendo que esse funcionario tem uma gratificacao de 5% sobre o salario base.
//alem disso, ele paga 7% de imposto sobre o salario base.

package secao03;

import java.util.Scanner;

public class Exer42 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double salB, salF, salG;
		
		System.out.print("Insira o salário base: R$");
		salB = sc.nextDouble();
		
		salG = 0.05*salB;
		System.out.println("A gratificação é de: R$" + salG);
		salG = salG + salB;
		salF = 0.07*salB;
		System.out.println("O desconto do imposto é de: R$" + salF);
		salF = salG - salF;
		
		System.out.println("O salário final é de: R$" + salF);
		
		sc.close();
	}

}
