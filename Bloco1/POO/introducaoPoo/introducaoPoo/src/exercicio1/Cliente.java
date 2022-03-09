package exercicio1;

import java.util.Scanner;
import exercicio1.DadosCliente;

public class Cliente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosCliente dados = new DadosCliente();

		System.out.println("Digite seu nome: ");
		dados.nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		dados.idade = sc.nextInt();
		System.out.println("Digite seu salário: ");
		dados.salario = sc.nextDouble();
		
		dados.dadosColetados();
	}

}
