package introducao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Entre com o valor da n1: ");
		n1 = sc.nextDouble();
		System.out.println("Entre com o valor da n2: ");
		n2 = sc.nextDouble();
		System.out.println("Entre com o valor da n3: ");
		n3 = sc.nextDouble();
		
		media = ((n1* 2.0)+ (n2 * 3.0)+ (n3 * 5.0))/ 10.0;
		
		System.out.printf("O valor média é %.2f%n", media );
		
		sc.close();
	}

}
