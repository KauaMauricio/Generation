package Exercicio3;

import java.util.ArrayList;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		Collection<String> itens = new ArrayList();
		
		itens.add("Biscoitos");
		itens.add("Tempeiros");
		itens.add("Bebidas");
		itens.add("Limpeza");
		itens.add("A�ougue");
		
		//itens.remove("A�ougue");
		
		//itens.clear();
		
		if (itens.isEmpty())
		{
			System.out.println("Lista vazia...");
		}
		else 
		{
			System.out.println("Lista itens no estoque " + itens);
		}
	
	}
}

