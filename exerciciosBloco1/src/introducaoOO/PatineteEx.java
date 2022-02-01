/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
 *em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informações deste objeto no console.
 * */

package introducaoOO;

public class PatineteEx {

	public static void main(String[] args) {
		
		Patinete pat = new Patinete ("Skatenet", 38);
		
		pat.descricao();
		pat.situacao();

	}

}
