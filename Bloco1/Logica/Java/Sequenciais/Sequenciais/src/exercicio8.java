import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double custoF, dist, imp, cc;
		System.out.println("Entre com o valor de F�brica do ve�culo: ");
		custoF = sc.nextDouble();
		dist = custoF * 0.28;
		imp = custoF * 0.45;
		cc = custoF + dist + imp;
		System.out.println("\nO valor de venda do ve�culo �: ");
		System.out.printf("%.2f%n",cc);

	}

}
