package introducao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x1, x2, y1, y2, d;
		
		System.out.print("Entre com x1: ");
		x1 = sc.nextDouble();
		System.out.print("Entre com y1: ");
		y1 = sc.nextDouble();
		System.out.print("Entre com x2: ");
		x2 = sc.nextDouble();
		System.out.print("Entre com y2: ");
		y2 = sc.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("O valor de D �: %.2f%n", d);
		
		sc.close();
	}

}
