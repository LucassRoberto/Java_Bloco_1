package introducaoOO;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nome do funcion�rio: ");
		String nome = sc.nextLine();
		System.out.println("Id do funcion�rio");
		int id = sc.nextInt();
		System.out.println("Digite o sal�rio do funcion�rio");
		double salario = sc.nextDouble();
		Funcionario fun = new Funcionario (nome, id, salario);
		
		fun.aumento();
		fun.status();
		
		
		sc.close();
	}

}
