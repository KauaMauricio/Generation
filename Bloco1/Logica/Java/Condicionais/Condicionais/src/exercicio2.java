import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.print("Digite um valor qualquer: ");
		a = sc.nextInt();
		System.out.print("Digite outro valor qualquer: ");
		b = sc.nextInt();
		System.out.print("Digite outro valor qualquer: ");
		c = sc.nextInt();

		if (a > b  && a > c && b > c) {
			System.out.println("Os valores em ordem crescente: " + c + "," + b + "," + a);
		}
		else if (b > a  && b > c && c > a) {
			System.out.println("Os valores em ordem crescente: " + a + "," + c + "," + b);
		}
		else if (c > a  && c > b && b > a) {
			System.out.println("Os valores em ordem crescente: " + a + "," + b + "," + c);
		}
		else
			System.out.print("Ops algo deu errado!");

	}

}
