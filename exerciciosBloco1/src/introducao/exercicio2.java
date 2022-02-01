package introducao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int totalDias, anos, meses, dias;
		
		System.out.println("Entre com a idade da pessoa em dias: ");
		totalDias = sc.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365)/ 30;
		dias = (totalDias % 365)% 30;
		
		System.out.println("A idade da pessoa é " + anos + " ano (s)" + " , " + meses + " mes (es)" + " e " + dias + " dia (s)");
		
		sc.close();	
		
	}

}
