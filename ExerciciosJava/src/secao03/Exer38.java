//leia o salario de um funcionario,
//calcule e imprima o valor do novo salario,
//sabendo que ele recebeu um aumento de 25%


package secao03;

import java.util.Scanner;

public class Exer38 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double salario, aumento;
		
		System.out.print("Insira o salário do funcionário: R$");
		salario = sc.nextDouble();
		aumento = 25*salario/100;
		salario = salario+aumento;
		
		System.out.println("O salário após o aumento é de: R$" + salario);
		System.out.println("O aumento foi de: R$" + aumento);
		
		sc.close();
	}

}
