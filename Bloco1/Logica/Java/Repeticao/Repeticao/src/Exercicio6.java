import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, cont = 0, media = 0;
		
		System.out.println("Digite um número diferente de 0 para começar! ou 0 para encerrar o programa.");
		
		do {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			media += num;
			cont++;
			
		} while (num != 0);
		System.out.println("Você digitou " + (cont-1) + " números e a média deles foi: " + (media/(cont-1)));
	}

}
