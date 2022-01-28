/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
 *  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize
 *   e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
 * */

package vetorEMatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int soma = 0, maior = 0, vezesMaior = 0;
		double media;
		
		int dado [] = new int [10];
		
		for (int i = 0; i<10; i++) {//entrando com os valores sorteados
			System.out.print("Digite um valor: ");
			dado [i]= sc.nextInt();
		}
		
		for (int i = 0; i<10; i++) {// imprimindo os n�meros do vetor
			System.out.print(dado [i] + " ");
		}
		
		for (int i = 0; i<10; i++) {//armazenando os valores para encontrar a m�dia
			soma = soma + dado [i];
		}
		
		media = soma / 10.0;// calcular a media
		
		for (int i = 0; i<10; i++) {//encontrar o maior valor
			if (dado[i]> maior){
				maior = dado [i];
			}
		}
		
		for (int i = 0; i<10; i++) {//ocorr�ncia do maior valor
			if (dado [i] == maior) {
				vezesMaior ++;
			}
		}
		
		System.out.println("\nA maior pontua��o � " + maior +" e aparece " + vezesMaior + " vezes.");	
		System.out.printf("A m�dia dos n�meros sorteados � %.2f%n", media);
		
		sc.close();
	}

}
