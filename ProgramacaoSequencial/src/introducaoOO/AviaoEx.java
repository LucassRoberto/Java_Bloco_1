/*Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto avi�o, defina as instancias deste objeto
 * e apresente as informa��es deste objeto no console. 
 * */
package introducaoOO;

import java.util.Scanner;

public class AviaoEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Defina a empresa do avi�o: ");
		String marca = sc.next();
		System.out.println("Entre com a quantidade de passageiros: ");
		int numeroPassageiros = sc.nextInt();
		System.out.println("O hor�rio de agora �: ");
		int horario = sc.nextInt();
		Aviao aviao = new Aviao (marca, numeroPassageiros, horario);
		
		
		aviao.status();
		aviao.situacao();
		
		sc.close();
	}

}
