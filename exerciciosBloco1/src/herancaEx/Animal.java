package herancaEx;

public class Animal {
	// atributos da classe animal
	private String nome;
	private int idade;
	
	public void emiteSom() {//métodos da classe
		System.out.println("O animal emite som. ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


}
