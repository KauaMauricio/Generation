package exercicio5;

import java.util.Scanner;
import exercicio5.DadosPatinete;

public class Patinete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DadosPatinete dados = new DadosPatinete();

		System.out.println("Digite a marca do produto: ");
		dados.marca = sc.nextLine();
		System.out.println("Digite o modelo do produto: ");
		dados.modelo = sc.nextLine();
		System.out.println("Digite a quantidade adquirida: ");
		dados.quantidade = sc.nextInt();
		System.out.println("Digite o valor do patinete: ");
		dados.preco = sc.nextDouble();
		
		dados.soma();
		dados.dadosColetados();
	}

}
