import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Entre com um n�mero: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O n�mero informado � par");
			System.out.println("A pot�ncia do n�mero informado �: " + Math.pow(n, 2));
		}
		else {
			System.out.println("O n�mero informado � �mpar");
			System.out.println("A raiz quadrada do n�mero informado �: " + Math.sqrt(n));
		}
		
	}
}
