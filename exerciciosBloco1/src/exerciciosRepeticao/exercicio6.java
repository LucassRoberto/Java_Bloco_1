/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 * 
 * */

package exerciciosRepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero, soma = 0, quant = 0;
		double media;
		
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();
		
		do {
			if (numero%3==0) {
				soma = soma + numero;
				quant = quant + 1;
			}
			System.out.println("Digite um n�mero: ");
			numero = sc.nextInt();
		}
		while (numero != 0);
		 
		
		media = (double) soma / quant;
		
		System.out.printf("A m�dia dos m�ltiplos de 3 �: %.2f%n", media);
		
		sc.close();
	}

}
