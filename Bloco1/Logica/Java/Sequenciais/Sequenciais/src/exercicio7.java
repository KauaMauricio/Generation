import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f, x, y, eb, fc;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = sc.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = sc.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = sc.nextDouble();
		System.out.println("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		eb = e + b;
		fc = f + c;
		x = (c * eb * f)/(a * eb * d);
		y = (a * fc * d)/(a * eb * d);
		System.out.println("Os valores de X e Y são respectivamente: " + x + " e " + y);

	}

}
