package secao04;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		
		System.out.print("Insira a primeira nota: ");
		x = sc.nextDouble();
		System.out.print("Insira a segunda nota: ");
		y = sc.nextDouble();
		
		if(x>=0&&x<=10) {
			if(y>=0&&y<=10) {
				z = (x+y)/2;
				System.out.println("A média é " + z);
			}
			else {
				System.out.println("A segunda nota não é válida");
			}
		}
		else {
			System.out.println("A primeira nota não é válida");
		}
		sc.close();
	}
}
