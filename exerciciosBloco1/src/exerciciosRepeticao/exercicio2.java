/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares
 */
package exerciciosRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x, y, contarNumeroPares = 0, contarNumeroImpares=0;
		
		System.out.println("Entre com 10 valores: ");
		
		for (x=0; x<10; x++) {
			y = sc.nextInt();
			if (y%2==0) {
				contarNumeroPares = contarNumeroPares + 1;
			}
			else {
				contarNumeroImpares = contarNumeroImpares + 1;
			}
		}
		
		System.out.println("Total de pares: " + contarNumeroPares);
		System.out.println("Total de �mpares: " + contarNumeroImpares);

		
	
		sc.close();
	}

}
