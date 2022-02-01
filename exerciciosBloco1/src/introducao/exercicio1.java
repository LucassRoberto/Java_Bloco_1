package introducao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int dias, meses, anos, totalDias;
		
		System.out.println("Entre com a idade da pessoa em anos: ");
		anos = sc.nextInt();
		
		System.out.println("Entre com a idade da pessoa em meses: ");
		meses = sc.nextInt();
		
		System.out.println("Entre com a idade da pessoa em dias: ");
		dias = sc.nextInt();
		
		totalDias = (anos* 365)+ (meses*30) + dias; 
		
		System.out.println("A pessoa viveu " + totalDias + " dias");
		
		sc.close();

	}

}
