/*Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto conta bancaria, defina as instancias deste objeto
 *  e apresente as informa��es deste objeto no console. 
 * */
package introducaoOO;

import java.util.Locale;

public class ContaEx {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Conta cont = new Conta ("Jo�o da Silva", 58940, 1000.00);
		
		cont.adicao();
		cont.status();

	}

}
