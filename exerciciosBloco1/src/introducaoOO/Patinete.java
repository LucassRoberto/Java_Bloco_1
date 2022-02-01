package introducaoOO;

public class Patinete {
	
	String marca;
	int tamanho;
	
	public Patinete(String marca, int tamanho) {
		this.marca = marca;
		this.tamanho = tamanho;
	}
	
	public void situacao() {
		System.out.println("O patinete está quebrado!");
	}
	
	public void descricao () {
		System.out.println("Marca do patinete: " + this.marca);
		System.out.println("Tamanho: " + this.tamanho);
	}

}
