/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.

 * */

package exerciciosRepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int idade, sexo, opcoes, dados = 0, calma =0, agressiva = 0, nervosa =0;
		int nCalmas =0, mNervosas = 0, hAgressivos = 0, pNervosas40 = 0, pCalmas18 = 0, oCalmos = 0 ;
		
		while (dados < 3) {
			System.out.print("Digite a idade da pessoa: ");
			idade = sc.nextInt();
			System.out.print("Digite o sexo da pessoa, sendo: 1: masculino. 2: feminino. 3 = outros: ");
			sexo = sc.nextInt();
			System.out.print("Digite as opções: 1: calma. 2: nervosa. 3: agressiva.: ");
			opcoes = sc.nextInt();
			
			if (opcoes == 1) {
				nCalmas = nCalmas + 1; // quantidade de pessoas calmas
			}
			if (sexo ==2 && opcoes ==2) {
				mNervosas = mNervosas +1;//número de mulheres nervosas
			}
			if (sexo == 1 && opcoes == 3) {
				hAgressivos = hAgressivos + 1;//  número de homens agressivos
			}
			if (sexo == 3 && opcoes ==1 ) {
				oCalmos = oCalmos + 1;//  número de outros calmos
			}
			if (idade>40 && opcoes== 2 ) {
				pNervosas40 = pNervosas40 + 1; //pessoas nervosas acima de 40 anos
			}
			if (idade <18 && opcoes == 1) {
				pCalmas18 = pCalmas18 + 1;// número de pessoas calmas com menos de 18 anos
			}
			
			dados ++;
		}
			System.out.println();
			System.out.println("Número de pessoas calmas: " + nCalmas); 
			System.out.println("Número de mulheres nervosas: " + mNervosas); 
			System.out.println("Número de homens agressivos: " + hAgressivos);
			System.out.println("Número de outros calmos: " + oCalmos);
			System.out.println("Número de pessoas nervosas com mais de 40 anos:  " + pNervosas40);
			System.out.println("Número de pessoas calmas com menos de 18 anos: " + pCalmas18);
		
		sc.close();
	}

}
