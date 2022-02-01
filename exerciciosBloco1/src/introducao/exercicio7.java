package introducao;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Entre com o valor de A: ");
		a = sc.nextInt();
		System.out.print("Entre com o valor de B: ");
		b = sc.nextInt();
		System.out.print("Entre com o valor de C: ");
		c = sc.nextInt();
		System.out.print("Entre com o valor de D: ");
		d = sc.nextInt();
		System.out.print("Entre com o valor de E: ");
		e = sc.nextInt();
		System.out.print("Entre com o valor de F: ");
		f = sc.nextInt();
		
		x = (c*e)- (b*f)/(a*e)-(b*d);
		y = (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.printf("Valor de x: %.2f%n", x );
		System.out.printf("Valor de y: %.2f%n", y);
		
		sc.close();
	}

}
