/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list. * 
 * */

package herancaEx;

import java.util.ArrayList;

public class EstoqueEx {

	public static void main(String[] args) {
		
	
		Estoque loja1 = new Estoque ("Cadeira ", 20);// criando os objetos
		Estoque loja2 = new Estoque ("Geladeira ", 5);// criando os objetos
		Estoque loja3 = new Estoque ("Fogão ", 10);// criando os objetos
		
		ArrayList <Estoque> lista = new ArrayList<>();// criando a lista
		lista.add(loja1);
		lista.add(loja2);// adicionando a lista 
		lista.add(loja3);
		
		lista.remove(2);// removendo da lista
		
		System.out.println(lista);	// apresentando todos os dados da lista 
		
		
	}

}
