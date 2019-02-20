//51 escreva um programa que leia as coordenadas x e y de pontos no r² 
//e calcule sua distancia de origem (0,0).

package secao03;

import java.util.Scanner;

public class Exer51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		double dab;
		
		System.out.println("Insira a coordenada de A no eixo X ");
		x1 = sc.nextInt();
		System.out.println("Insira a coordenada de A no eixo Y ");
		y1 = sc.nextInt();
		System.out.println("Insira a coordenada de B no eixo X ");
		x2 = sc.nextInt();
		System.out.println("Insira a coordenada de B no eixo Y ");
		y2 = sc.nextInt();
		
		if(x1>=0&&y1>0) {
			dab = ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			dab = Math.sqrt(dab);
			System.out.println(dab);
		}
		else if(x1<0&&y1>=0) {
			dab = ((x2-(-x1))*(x2-(-x1)) + (y2-y1)*(y2-y1));
			dab = Math.sqrt(dab);
			System.out.println(dab);
		}
		else if(x1>=0&&y1<0) {
			dab = ((x2-x1)*(x2-x1) + (y2-(-y1))*(y2-(-y1)));
			dab = Math.sqrt(dab);
			System.out.println(dab);
		}
		sc.close();
	}

}
