package introducao;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double cConsumidor, cFabrica, porcentagem, impostos;
		
		System.out.println("Entre com o custo de f�brica: ");
		cFabrica = sc.nextInt();
		
		porcentagem = 0.28;
		impostos = 0.45;
		
		cConsumidor = (cFabrica + (cFabrica * impostos )+ (cFabrica*porcentagem));
		
		System.out.println("O custo ao consumidor � de " + cConsumidor);
		sc.close();
	}

}
