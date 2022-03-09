import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resp, sobra;
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual sua idade expressa em dias?: " );
		resp = sc.nextInt();
		
        anos = resp / 365;
		sobra = resp % 365;
		meses = sobra / 30;
		dias = sobra % 30;
				
		System.out.println("Sua idade é: " + anos + " anos, " + meses + " meses e " + dias +" dias");
	}

}
