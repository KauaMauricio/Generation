import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ev, h, m, s, r;
		System.out.println("Digite o tempo de duração em segundos: ");
		ev = sc.nextInt();
		h = ev / 3600;
		r = ev % 3600;
		m = r / 60;
		s = r % 60;
		System.out.println("O tempo de duração é de " + h + " horas " + m + " minutos e " + s + " segundos");

	}

}
