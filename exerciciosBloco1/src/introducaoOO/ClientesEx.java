/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente
 * as informações deste objeto no console. 
 * */
package introducaoOO;

import java.util.Scanner;

public class ClientesEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		System.out.println("Digite o número de celular da pessoa: ");
		String numCel = sc.next();
		System.out.println("Digite o email da pessoa: ");
		String email = sc.next();
		Clientes cliente = new Clientes (nome, numCel, email);
		
		
		System.out.println();
		
		cliente.dados();
		
		
		sc.close();
	}

}
