import java.util.ArrayList;
import java.util.Collections;                              //IMPORTANDO AS CLASSES NECESS�RIAS
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);	
		Cliente c1 = new Cliente("1010", "jos� aldo");                  //IMPORTANDOS OS OBJETOS
		Funcionario func1 = new Funcionario("21003192312", "Atendente", "Ronaldo Miguel");
		Remedio rem = new Remedio();
		
		String remedio1 = " ";
		String remedio2 = "Doril";                                //CRIANDO AS VARI�VEIS
		String remedio3 = "Engov";
		String remedio4 = "Ibuprofeno";		
		
		ArrayList<String>remedios = new ArrayList<>();				//CRIANDO ARRAYLIST DO TIPO STRING PARA PASSARMOS O NOME DOS REM�DIOS
		int num =1;
		boolean continuar = true;		
		
		try {
			
			while(continuar == true) {
				
				System.out.println("Escolha a op��o Desejada: \n[1]Iniciar Rotina de compra\n[2]Cadastrar produtos\n[3]Consultar produtos\n[4]Atualizar Estoque\n[5]Excluir produtos\n[6] Sair");
				num = read.nextInt();
				
				if(num == 1 || num ==2 || num == 3 || num ==4 || num == 5 || num == 6) {
					
					if(num == 1) {
						
						System.out.println("Cliente "+c1.getNome()+ " Acaba de entrar na loja!");
						c1.falar();
						System.out.print("o "+func1.getCargo()+" "+func1.getNome());
						func1.atendender(); 
						c1.comprar();
						
					} else if (num == 2) {
						
						remedios.clear();
						
						System.out.println("Digite o nome do remedio para adicionar: ");
						remedio1 = read.next();
						remedios.add(remedio1);
						remedios.add(remedio2);
						remedios.add(remedio3);
						remedios.add(remedio4);
						rem.adicionar();
									
						} else if (num == 3) {
							
						System.out.println("Remedios disponiveis: ");
						Collections.sort(remedios);
						System.out.println(remedios);
					    } else if (num == 4) {
					    	
						remedios.set(2, "Epocler");
						rem.atualizar();						
					    } else if (num == 5) {
						remedios.remove(2);
						rem.excluir();
					    } else if (num == 6) {
						continuar = false;
					    }
				        } else
					       System.out.println("Voc� digitou um numero invalido!");					
				
			          	System.out.println("\n");
			
		              	}
			
		             	read.close();
			
			
		               }catch (InputMismatchException erro ) {
		            	   
		             	   System.out.println("Voc� digitou uma op��o invalida por favor digite um n�mero valido para continuar");
	                   }  System.out.println("Programa Encerrado.");
		
							
	  }

}