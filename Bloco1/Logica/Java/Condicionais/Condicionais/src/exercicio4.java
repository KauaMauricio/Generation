import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Entre com um número: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O número informado é par");
			System.out.println("A potência do número informado é: " + Math.pow(n, 2));
		}
		else {
			System.out.println("O número informado é ímpar");
			System.out.println("A raiz quadrada do número informado é: " + Math.sqrt(n));
		}
		
	}
}
