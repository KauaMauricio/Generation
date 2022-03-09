import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, mediaP;

		System.out.print("entre com as medias: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n1 = n1 * 2;	
		n2 = n2 * 3;
		n3 = n3 * 5;
		mediaP = (n1+n2+n3)/10;
		System.out.println("\na média ponderada é: " + mediaP);
		
	}

}
