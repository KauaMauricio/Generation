package exercicio3;

import java.util.Scanner;
import exercicio3.DadosEletronico;

public class Eletronico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosEletronico dados = new DadosEletronico();

		System.out.println("Digite a marca do seu eletrônico: ");
		dados.marca = sc.nextLine();
		System.out.println("Digite o ano de fábrica do seu eletrônico: ");
		dados.ano = sc.nextInt();
		System.out.println("Digite o preço: ");
		dados.preco = sc.nextDouble();
		
		dados.dadosColetados();
	}

}
