//49 faca um programa para ler o horario(horas, minutos e segundos) de inicio e duracao,
//em segundos, de uma experiência biológica.
//O programa deve resultar com o novo horário(hora, minuto e segundo) do termino da mesma.

package secao03;

import java.util.Scanner;

public class Exer49 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hr, hrF, min, minF, segI, segF, segD;
		
		System.out.println("Horário de inicio");
		System.out.println("Horas: ");
		hr = sc.nextInt();
		System.out.println("Minutos: ");
		min = sc.nextInt();
		System.out.println("Segundos: ");
		segI = sc.nextInt();
		System.out.println("\nDuraçãoda experiência");
		System.out.println("Duranção em segundos: ");
		segD = sc.nextInt();
		
		hrF = segD/3600;
		segD = segD%3600;
		minF = segD/60;
		segF = segD%60;
		
		hr = hr + hrF;
		min = min + minF;
		segI = segI + segF;

		if(segI>=60) {
			int auxs;
			auxs = segI - 60;
			segI = auxs;
			min = min + 1;
			if(min>=60) {
				int auxm;
				auxm = min - 60;
				min = auxm;
				hr = hr+1;
				if(hr<24) {
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr>24){
					hr = 1;
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr==24) {
					hr = 0;
					System.out.println(hr + ":" + min + ":" + segI);	
				}
			}
			else {
				if(hr<24) {
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr>24){
					hr = 1;
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr==24) {
					hr = 0;
					System.out.println(hr + ":" + min + ":" + segI);	
				}
			}	
		}
		else {
			if(min>=60) {
				int auxm;
				auxm = min - 60;
				min = auxm;
				hr = hr+1;
				if(hr<24) {
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr>24){
					hr = 1;
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr==24) {
					hr = 0;
					System.out.println(hr + ":" + min + ":" + segI);	
				}
			}
			else {
				if(hr<24) {
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr>24){
					hr = 1;
					System.out.println(hr + ":" + min + ":" + segI);
				}
				else if(hr==24) {
					hr = 0;
					System.out.println(hr + ":" + min + ":" + segI);	
				}
			}
		}
		sc.close();
	}
}