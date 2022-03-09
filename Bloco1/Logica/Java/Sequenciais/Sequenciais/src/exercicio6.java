import java.util.Scanner;
import java.lang.Math;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, d;
		
	    System.out.print("Entre com as coordenadas do ponto de partida: ");
	    x1 = sc.nextDouble();
	    x2 = sc.nextDouble();
		System.out.print("Entre com as coordenadas do ponto de destino: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
	    d = Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0) + 2.0);
		System.out.println("A distância entre os dois pontos é: ");
		System.out.printf("%.2f%n", d);

	}

}
