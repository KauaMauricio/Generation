package Exercicio1;
import java.util.Scanner;
public class Animal {
	
	Scanner sc = new Scanner(System.in);
	
	public String nome, som, movimento;
	public int idade;
	
	public void nomeAnimal() {
		System.out.println("Digite o nome do animal: ");
		nome = sc.nextLine();
	}
	
	public void idadeAnimal() {
		System.out.println("Digite a idade do animal: ");
		idade = sc.nextInt();
	}
	 
	 public void somAnimal() {
		 System.out.println("Qual o som que o animal emite?");
		 som = sc.next();
	}
	 public void movimentoAnimal() {
		 System.out.println("Qual a forma do animal de se mover?");
		 movimento = sc.next();
		 System.out.println("FIM DO PROGRAMA.");
	}

}
