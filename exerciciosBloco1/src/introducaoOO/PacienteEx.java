/*Crie uma classe paciente e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.* 
 * 
 */
package introducaoOO;

public class PacienteEx {

	public static void main(String[] args) {
		
		Paciente pac = new Paciente ("Jos� Rocha", 45);
		
		pac.status();
		pac.situacao();

	}

}
