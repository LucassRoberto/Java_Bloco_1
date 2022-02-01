package introducaoOO;

public class Paciente {
	
	String nome;
	int idade;
	
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void situacao() {
		System.out.println("Situação: O paciente acima está em recuperação.");
	}
	
	public void status() {
		System.out.println("Nome do paciente: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}

}
