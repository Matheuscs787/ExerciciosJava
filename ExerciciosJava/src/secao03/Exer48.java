//48 leia um valor inteiro em segundos, e imprima em horas, minutos e segundos.

package secao03;

import java.util.Scanner;

public class Exer48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int seg, hr, min;
		
		System.out.println("Conversor de segundos para horas, minutos e segundos");
		System.out.println("Insira a quantidade de segundo: ");
		seg = sc.nextInt();
		
		hr = seg/3600;
		seg = seg%3600;
		min = seg/60;
		seg = seg%60;
		
		System.out.println(hr + ":" + min + ":" + seg);
		sc.close();
	}

}
