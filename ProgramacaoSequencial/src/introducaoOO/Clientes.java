package introducaoOO;

public class Clientes {
	//Atributos
		String nome;
		String numCel;
		String email;
		
		// criando o construtor
		public Clientes(String nome, String numCel, String email) {
			this.nome = nome;
			this.numCel = numCel;
			this.email = email;
		}
		
		public void dados () {
			System.out.println("Dados dos clientes da loja: ");
			System.out.println("Nome: " + this.nome);
			if (this.numCel.length()==11) {
				System.out.println("Número do celular: " + this.numCel);
			}
			else {
				System.out.println("Número inválido. Insira novamente com 11 dígitos");
			}
			System.out.println("Email: " + email);

		}
		
		
		
	
	
}
