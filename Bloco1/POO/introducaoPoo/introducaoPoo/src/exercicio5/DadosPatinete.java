package exercicio5;

public class DadosPatinete {
	
	String marca, modelo;
	int quantidade;
	double preco;
	
	public void dadosColetados() {
		System.out.println("Marca informado: " + marca);
		System.out.println("Modelo informada: " + modelo);
		System.out.println("Quantidade informada: " + quantidade);
		System.out.println("Pre?o informado: " + preco);
	}	
	public double soma() {
		return quantidade * preco;
	}
}
