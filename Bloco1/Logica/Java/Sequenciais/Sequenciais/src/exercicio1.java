import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resp;
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos anos voc� tem?: " );
		anos = sc.nextInt();
		System.out.print("Quantos m�ses voc� tem?: " );
		meses = sc.nextInt();
		System.out.print("Quantos dias voc� tem?: " );
		dias = sc.nextInt();
		
		resp = anos * 365 + meses * 30 + dias;
				
		System.out.println("Sua idade em dias �: " + resp);
	}

}
