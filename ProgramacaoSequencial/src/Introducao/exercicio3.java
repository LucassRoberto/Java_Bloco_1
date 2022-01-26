package Introducao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int totalSegundos, horas, minutos, segundos;
		
		System.out.println("Entre com a quantidade de segundos do evento: ");
		totalSegundos = sc.nextInt();
		
		horas = totalSegundos/ 3600;
		minutos = (totalSegundos%3600)/60;
		segundos = (totalSegundos%3600)%60;
		
		System.out.println("O evento tem "+ horas + " horas "+ ", " + minutos + " minutos" + " e "+ segundos + " segundos");
		
		
		sc.close();
	}

}
