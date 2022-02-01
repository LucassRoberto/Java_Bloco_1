package introducaoOO;

public class Funcionario {
	
	String nome;
	int id;
	double salario;
	
	public Funcionario(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public void aumento(){
		this.salario += this.salario * 0.10;
	}
	
	public void status() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Id: "+ this.id);
		System.out.printf("Novo salário: %.2f%n", this.salario);
	}

}
