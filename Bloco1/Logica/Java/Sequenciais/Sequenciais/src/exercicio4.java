import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		
		r = Math.pow(a + b, 2.0);
		s = Math.pow(b + c, 2.0);
		d = (r + s)/2;
		System.out.print("O resultado é: ");
		System.out.printf("%.2f%n", d);

	}

}
