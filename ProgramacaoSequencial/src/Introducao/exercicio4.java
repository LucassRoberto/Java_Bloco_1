package Introducao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 int a,b,c, d, r, s;
		 
		 System.out.println("Entre com o valor de A: ");
		 a = sc.nextInt();
		 System.out.println("Entre com o valor de B: ");
		 b = sc.nextInt();
		 System.out.println("Entre com o valor de C: ");
		 c = sc.nextInt();
		 
		 r = (a + b) * (a+b);
		 
		 s = (b+c)*(b+c);
		 
		 d = (r+s)/ 2;
		 
		 System.out.println("O valor do D é: " + d);
		 
		
		
		sc.close();
	}

}
