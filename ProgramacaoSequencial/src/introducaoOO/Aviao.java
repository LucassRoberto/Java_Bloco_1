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
			System.out.println("O avião ainda está no aeroporto.");
		}
		else if (this.horario == 15) {
			System.out.println("O avião irá decolar nos próximos minutos.");
		}
		else {
			System.out.println("O avião já decolou.");
		}	
	}
	
	public void status() {
		System.out.println("Marca do avião: " + this.marca);
		System.out.println("Quantidade de passageiros: " + this.numeroPassageiros);
		System.out.println("Hora atual: " + this.horario);
	}
	
	

}
