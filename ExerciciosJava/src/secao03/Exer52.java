//52 tres amigos jogaram na loteria.
//caso eles ganhem o premio deve ser repartido proporcionalmente ao valor que cada um deu 
//para a realizacao da aposta.
//faca um programa que leia quanto cada apostador investiu, o valor do premio,
//e imprima quanto cada um ganharia do premio com base no valor investido

package secao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer52 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double inv1, inv2, inv3, premio, aposta;
		
		System.out.println("Quanto o primeiro apostador investiu? R$");
		inv1 = sc.nextDouble();
		System.out.println("Quanto o segundo apostador investiu? R$");
		inv2 = sc.nextDouble();
		System.out.println("Quanto o terceiro apostador investiu? R$");
		inv3 = sc.nextDouble();
		System.out.println("Qual o valor do prêmio? R$");
		premio = sc.nextDouble();
		
		aposta = inv1 + inv2 + inv3;
		inv1 = (inv1*100)/aposta;
		System.out.println("O primeiro apostador investiu " + df.format(inv1) + "% do valor total da aposta");
		inv1 = inv1*premio/100;
		System.out.println("E vai ganhar R$" + df.format(inv1));
		inv2 = (inv2*100)/aposta;
		System.out.println("O segundo apostador investiu " + df.format(inv2) + "% do valor total da aposta");
		inv2 = inv2*premio/100;
		System.out.println("E vai ganhar R$" + df.format(inv2));
		inv3 = (inv3*100)/aposta;
		System.out.println("O terceiro apostador investiu " + df.format(inv3) + "% do valor total da aposta");
		inv3 = inv3*premio/100;
		System.out.println("E vai ganhar R$" + df.format(inv3));
	
		sc.close();
	}

}
