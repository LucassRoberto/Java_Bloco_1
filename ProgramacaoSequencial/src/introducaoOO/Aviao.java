package introducaoOO;

public class Aviao {
	
	String marca;
	int numeroPassageiros;
	int horario;

	public Aviao(String marca, int numeroPassageiros, int horario) {
		this.marca = marca;
		this.numeroPassageiros = numeroPassageiros;
		this.horario = horario;
	}

	public void situacao () {
		if (this.horario < 15) {
			System.out.println("O avi�o ainda est� no aeroporto.");
		}
		else if (this.horario == 15) {
			System.out.println("O avi�o ir� decolar nos pr�ximos minutos.");
		}
		else {
			System.out.println("O avi�o j� decolou.");
		}	
	}
	
	public void status() {
		System.out.println("Marca do avi�o: " + this.marca);
		System.out.println("Quantidade de passageiros: " + this.numeroPassageiros);
		System.out.println("Hora atual: " + this.horario);
	}
	
	

}
