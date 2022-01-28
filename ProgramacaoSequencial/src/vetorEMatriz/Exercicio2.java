/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 *  A seguir determine e imprima a média aritmética dos lançamentos, contabilize
 *   e apresente também quantas foram as ocorrências da maior pontuação.
 * */

package vetorEMatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int media, soma = 0, maior = 0, vezesMaior = 0;
		int dado [] = new int [10];
		
		for (int i = 0; i<10; i++) {//entrando com os valores sorteados
			System.out.print("Digite um valor: ");
			dado [i]= sc.nextInt();
		}
		
		for (int i = 0; i<10; i++) {// imprimindo os números do vetor
			System.out.print(dado [i] + " ");
		}
		
		for (int i = 0; i<10; i++) {//armazenando os valores para encontrar a média
			soma = soma + dado [i];
		}
		
		media = soma / 10;// calcular a media
		
		for (int i = 0; i<10; i++) {//encontrar o maior valor
			if (dado[i]> maior){
				maior = dado [i];
			}
		}
		
		for (int i = 0; i<10; i++) {//ocorrência do maior valor
			if (dado [i] == maior) {
				vezesMaior ++;
			}
		}
		
		System.out.println("\nA maior pontuação é: " + maior +" e aparece " + vezesMaior + " vezes.");	
		
		sc.close();
	}

}
