import java.util.ArrayList;
import java.util.Collections;                              //IMPORTANDO AS CLASSES NECESSÁRIAS
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);	
		Cliente c1 = new Cliente("1010", "josé aldo");                  //IMPORTANDOS OS OBJETOS
		Funcionario func1 = new Funcionario("21003192312", "Atendente", "Ronaldo Miguel");
		Remedio rem = new Remedio();
		
		String remedio1 = " ";
		String remedio2 = "Doril";                                //CRIANDO AS VARIÁVEIS
		String remedio3 = "Engov";
		String remedio4 = "Ibuprofeno";		
		
		ArrayList<String>remedios = new ArrayList<>();				//CRIANDO ARRAYLIST DO TIPO STRING PARA PASSARMOS O NOME DOS REMÉDIOS
		int num =1;                                              //O PRIMEIRO NÚMERO DIGITADO COMEÇA APARTIR DO NÚMERO 1
		boolean continuar = true;		
		
		try {
			
			while(continuar == true) {                      //OPÇÃO ENQUANTO O USUÁRIO NÃO ENCERRAR O POGRAMA
				
				System.out.println("Escolha a opção Desejada: \n[1]Iniciar Rotina de compra\n[2]Cadastrar produtos\n[3]Consultar produtos\n[4]Atualizar Estoque\n[5]Excluir produtos\n[6] Sair");
				num = read.nextInt();
				
				if(num == 1 || num ==2 || num == 3 || num ==4 || num == 5 || num == 6) {
					
					if(num == 1) {
						
						System.out.println("Cliente "+c1.getNome()+ " Acaba de entrar na loja!");
						c1.falar();
						System.out.print("o "+func1.getCargo()+" "+func1.getNome());
						func1.atender(); 
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
				        } else                                                          //CASO O USUÁRIO ENTRE COM UM NÚMERO DIFERENTE DE 1 A 6
					       System.out.println("Você digitou um numero invalido!");					
				
			          	System.out.println("\n");
			
		              	}
			
		             	read.close();                         //FIM DO PROGRAMA
			
			
		               }catch (InputMismatchException erro ) {              //CASO O USUÁRIO ENTRE COM LETRA E NÃO COM UM NÚMERO
		            	   
		             	   System.out.println("Você digitou uma opção invalida por favor digite um número valido para continuar");
	                   }catch (IndexOutOfBoundsException erro ) {               //CASO O USUÁRIO ATUALIZE OS ITENS DO ESTOQUE SEM ANTES CADASTRAR
	           			System.out.println("Não é possivel atualizar ou excluir itens do estoque antes de cadastrar itens!");
	           			
	           		   }
		               System.out.println("Programa Encerrado.");
	                   
							
	  }

}