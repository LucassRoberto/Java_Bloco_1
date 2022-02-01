/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto avião, defina as instancias deste objeto
 * e apresente as informações deste objeto no console. 
 * */
package introducaoOO;

import java.util.Scanner;

public class AviaoEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Defina a empresa do avião: ");
		String marca = sc.next();
		System.out.println("Entre com a quantidade de passageiros: ");
		int numeroPassageiros = sc.nextInt();
		System.out.println("O horário de agora é: ");
		int horario = sc.nextInt();
		Aviao aviao = new Aviao (marca, numeroPassageiros, horario);
		
		
		aviao.status();
		aviao.situacao();
		
		sc.close();
	}

}
