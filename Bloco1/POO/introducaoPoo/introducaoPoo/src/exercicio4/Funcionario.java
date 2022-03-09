package exercicio4;

import java.util.Scanner;
import exercicio4.DadosFuncionario;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosFuncionario dados = new DadosFuncionario();

		System.out.println("Digite seu nome: ");
		dados.nome = sc.nextLine();
		System.out.println("Digite quantos anos você tem na empresa: ");
		dados.anosEmpresa = sc.nextInt();
		System.out.println("Digite seu salário: ");
		dados.salario = sc.nextDouble();
		
		dados.dadosColetados();
	}

}
