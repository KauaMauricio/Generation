package exercicio2;

import java.util.Scanner;
import exercicio2.DadosAviao;

public class Aviao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosAviao dados = new DadosAviao();

		System.out.println("Digite o nome da empresa do avião: ");
		dados.empresa = sc.nextLine();
		System.out.println("Digite a hora do voo: ");
		dados.hora = sc.nextInt();
		System.out.println("Digite o valor da passagem: ");
		dados.preco = sc.nextDouble();
		
		dados.dadosColetados();
	}

}

