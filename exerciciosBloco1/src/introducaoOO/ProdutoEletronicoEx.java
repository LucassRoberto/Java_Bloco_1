/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes 
 * esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
 * */package introducaoOO;

import java.util.Scanner;

public class ProdutoEletronicoEx {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Entre com o tipo do produto: ");
		String tipo = sc.next();
		System.out.print("Entre com a marca do produto: ");
		String marca =sc.next();
		System.out.print("A quantidade em estoque é de: ");
		int quant = sc.nextInt();
		ProdutoEletronico prod = new ProdutoEletronico (tipo, marca, quant);
		
		prod.status();
		prod.estoque();
		
		sc.close();
	}

}
