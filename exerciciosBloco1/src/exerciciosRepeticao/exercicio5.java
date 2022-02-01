/*Crie um programa que leia um número do teclado até que encontre um número
 * igual a zero. 
 * No final, mostre a soma dos números digitados
 * */

package exerciciosRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, somaNumeros = 0;
		
		System.out.println("Entre com um número: ");
		x = sc.nextInt();
		
		do {
			somaNumeros = somaNumeros + x;
			System.out.println("Entre com um número: ");
			x = sc.nextInt();
		}
		while (x!=0);
		
		System.out.println("A soma é: " + somaNumeros);
		
		sc.close();
	}

}
