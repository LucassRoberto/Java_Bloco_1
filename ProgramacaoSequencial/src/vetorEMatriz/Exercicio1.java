/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
 * Encontre ap�s a maior pontua��o e a apresente.
 * */
package vetorEMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int maior = 0;
		int vet [] = new int [5];
		
		for (int i=0; i<5; i++) {// criar vetor
			System.out.print("Digite uma pontua��o: ");
			vet [i] = sc.nextInt();
		}
		
		for (int i=0; i<5; i++) {// imprimir o vetor
			System.out.print(vet [i] + "  ");
		}
			
		for (int i=0; i<5; i++) {// descobrir o maior vetor
			if (vet [i] > maior) {
				maior = vet [i];
			}
		}
		
		System.out.println();
		System.out.println("A maior pontua��o �: " + maior);
		
		
		
		sc.close();
	}

}
