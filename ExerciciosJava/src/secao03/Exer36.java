//leia a altura e o raio de um cilindro em metros e imprima o volume do cilindro.
//O volume de um cilindro circular é calculado por meio da seguinte fórmula: V = pi*raio²*altura,
//onde pi = 3,141592;

package secao03;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float altura, raio;
		double volume;
		
		System.out.print("Insira a altura do cilindro em metros: ");
		altura = sc.nextFloat();
		System.out.print("Insira o raio do cilindro em metros: ");
		raio = sc.nextFloat();
		
		volume = 3.141592*(raio*raio)*altura;
		System.out.println("O volume é de: " + volume);
		
		sc.close();
	}

}
