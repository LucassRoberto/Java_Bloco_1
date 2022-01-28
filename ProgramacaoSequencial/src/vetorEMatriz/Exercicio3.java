/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 *Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
 *Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 * */
package vetorEMatriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		
		for (int linha=0; linha<4; linha++) {//criando a primeira matriz
			for (int coluna=0; coluna <6; coluna++) {
				System.out.print("Digite um valor na matriz 1: ");
				n1[linha][coluna] = sc.nextInt();
			}
		}
		
		for (int linha=0; linha<4; linha++) {// criando a segunda matriz
			for (int coluna=0; coluna <6; coluna++) {
				System.out.print("Digite um valor na matriz 2: ");
				n2[linha][coluna] = sc.nextInt();
			}
		}
		
		for (int linha=0; linha<4; linha++) {// criando a primeira matriz que é a soma de n1 + n2
			for (int coluna=0; coluna <6; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
			}
		}

		for (int linha=0; linha<4; linha++) {// imprimindo os valores da m1
			for (int coluna=0; coluna <6; coluna++) {
				System.out.print(m1[linha][coluna] + " "); 
			}
		}
		
		
		for (int linha=0; linha<4; linha++) {// criando a primeira matriz que é a diferença de n1-n2
			for (int coluna=0; coluna <6; coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
		}
		
		System.out.println();
		for (int linha=0; linha<4; linha++) {// criando a primeira matriz que é a diferença de n1-n2
			for (int coluna=0; coluna <6; coluna++) {
				System.out.print(m2[linha][coluna] + " ");
			}
		}
		
		
		sc.close();
	}

}
