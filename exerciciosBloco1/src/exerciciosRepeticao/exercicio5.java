/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
 * igual a zero. 
 * No final, mostre a soma dos n�meros digitados
 * */

package exerciciosRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, somaNumeros = 0;
		
		System.out.println("Entre com um n�mero: ");
		x = sc.nextInt();
		
		do {
			somaNumeros = somaNumeros + x;
			System.out.println("Entre com um n�mero: ");
			x = sc.nextInt();
		}
		while (x!=0);
		
		System.out.println("A soma �: " + somaNumeros);
		
		sc.close();
	}

}
