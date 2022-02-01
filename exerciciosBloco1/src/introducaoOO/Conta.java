package introducaoOO;

public class Conta {
	
	String nome;
	int numero;
	double saldo;
	
	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void adicao () {
		this.saldo += 200.00;
	}
	
	public void status() {
		System.out.println("Nome do cliente: "+ this.nome);
		System.out.println("Número da conta: "+ this.numero);
		System.out.printf("Saldo atual: %.2f%n", this.saldo);
	}

}
