import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, cont = 0, media = 0;
		
		System.out.println("Digite um n�mero diferente de 0 para come�ar! ou 0 para encerrar o programa.");
		
		do {
			System.out.println("Informe um n�mero: ");
			num = sc.nextInt();
			media += num;
			cont++;
			
		} while (num != 0);
		System.out.println("Voc� digitou " + (cont-1) + " n�meros e a m�dia deles foi: " + (media/(cont-1)));
	}

}
