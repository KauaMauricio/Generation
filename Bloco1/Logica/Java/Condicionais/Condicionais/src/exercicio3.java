import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Informe sua idade: ");
        idade = sc.nextInt();
        
        if (idade >= 10 && idade <= 14) {
        	System.out.println("sua categoria é: Infantil");
        }
        else if (idade >= 15 && idade <= 17) {
        	System.out.println("sua categoria é: Juvenil");
        }
        else if (idade >= 18 && idade <= 25) {
        	System.out.println("sua categoria é: Adulto");
        }
        else
			System.out.print("Ops algo deu errado!");
	}

}
