import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		while (idade < 100) {
			System.out.println("Entre com a sua idade: ");
			idade = sc.nextInt();
			
			if (idade < 21) {
				menor++;
			} else 
				maior++;
		}
        System.out.println("Temos " + (menor-1) + " pessoas com menos de 21 anos e " + maior + " pessoas com mais de 50 anos");
	}

}
