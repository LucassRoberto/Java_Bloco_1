/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
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
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		do {
			if (numero%3==0) {
				soma = soma + numero;
				quant = quant + 1;
			}
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
		}
		while (numero != 0);
		 
		
		media = (double) soma / quant;
		
		System.out.printf("A média dos múltiplos de 3 é: %.2f%n", media);
		
		sc.close();
	}

}
