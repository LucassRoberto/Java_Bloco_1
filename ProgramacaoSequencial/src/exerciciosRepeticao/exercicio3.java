/*Solicitar a idade de v�rias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99.
 */

package exerciciosRepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int idade, menor21 = 0, maior50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();
		
		while (idade != -99) {
			if (idade <21) {
				menor21 = menor21 + 1;
			}
			else if (idade > 50) {
				maior50 = maior50 + 1;
			}
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();	
		}
		
		System.out.println("Pessoas abaixo de 21 anos: " + menor21);
		System.out.println("Pessoas com mais de 50 anos: " + maior50);		
		
		
		sc.close();
	}

}
