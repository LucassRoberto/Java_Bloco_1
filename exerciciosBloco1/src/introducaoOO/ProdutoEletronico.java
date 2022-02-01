package introducaoOO;

public class ProdutoEletronico {

	String tipo;
	String marca;
	int quant;
	
	public ProdutoEletronico(String tipo, String marca, int quant) {
		this.tipo = tipo;
		this.marca = marca;
		this.quant = quant;
	}
	
	public void estoque() {
		if (this.quant < 0 ) {
			System.out.println("Não temos o item em estoque");
		}
		else if (this.quant <10) {
			System.out.println("O item está acabando");
		}
		else {
			System.out.println("O estoque está cheio");
		}
	}
		
	public void status () {
		System.out.println("Tipo do produto: " + this.tipo);
		System.out.println("Marca do produto: "+ this.marca);
		System.out.println("Qauntidade em estoque: "+ this.quant);
	}
		
	}

