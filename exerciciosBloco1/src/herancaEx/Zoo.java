/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as características
 * de forma que tudo o que for comum a todos os animais fique na classe Animal: 
 * 
 * 
 * */
package herancaEx;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Cavalo cavalo = new Cavalo();
		Cachorro dog = new Cachorro();
		Preguica preg = new Preguica();
		
		System.out.print("Nome do cachorro: ");//características de um cachorro
		dog.setNome(sc.next());
		System.out.print("Idade: ");
		dog.setIdade (sc.nextInt());
		dog.emiteSom();
		dog.correr();
		System.out.println();
		
		System.out.print("Nome do cavalo: ");// características de um cavalo
		cavalo.setNome(sc.next());
		System.out.print("Idade: ");
		cavalo.setIdade (sc.nextInt());
		cavalo.emiteSom();
		cavalo.correr();
		System.out.println();
		
		System.out.print("Nome da preguiça: ");// características de uma preguiça
		preg.setNome(sc.next());
		System.out.print("Idade: ");
		preg.setIdade (sc.nextInt());
		preg.emiteSom();
		preg.subir();
		System.out.println();
		
				
		sc.close();
	}

}
