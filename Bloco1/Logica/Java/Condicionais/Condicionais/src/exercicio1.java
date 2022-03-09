import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		System.out.print("Digite um valor para A: ");
		a = sc.nextInt();
		System.out.print("Digite um valor para B: ");
		b = sc.nextInt();
		System.out.print("Digite um valor para c: ");
		c = sc.nextInt();

		if (a > b  && a > c) {
			System.out.print("O valor de A é o maior.");
		}
		if (b > a  && b > c) {
        	System.out.print("O valor de B é o maior.");
		}
		if (c > a  && c > b) {
        	System.out.print("O valor de C é o maior.");
		}
		else
			System.out.print("Ops algo deu errado!");
	}

}
