/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 * 
 * */

package vetorEMatriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		int somaMatriz = 0, somaDiagonal = 0;
		int [][] mat = new int [3][3];
		
		System.out.println("Entre com os valores da matriz: ");//definindo os valores da matriz
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				mat [linha][coluna]= sc.nextInt();
			}
		}
		
		for (int linha=0; linha<3; linha++) {// somando todos os valores da matriz
			for (int coluna=0; coluna<3; coluna++) {
				somaMatriz = somaMatriz + mat [linha][coluna];
			}
		}
		
		for (int linha=0; linha<3; linha++) {//somando os valores da diagonal
			for (int coluna=0; coluna<3; coluna++) {
				if (linha == coluna) {
					somaDiagonal = somaDiagonal + mat[linha][coluna]; 
				}
			}
		}
		
		System.out.println("A soma da matriz é: " + somaMatriz);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);
		
		
		
		sc.close();
	}

}
