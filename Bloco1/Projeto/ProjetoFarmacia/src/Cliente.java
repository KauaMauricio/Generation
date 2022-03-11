public class Cliente extends Pessoa {

	private String codCliente;   //PARA ARMAZENAR O CÓDIGO DO CLIENTE DA LOJA

	public Cliente(String cod, String nome) {      
		this.codCliente = cod;                        //PARA PUXAR O CÓDIGO DO CLIENTE
		super.setNome(nome);                   //ESTOU DIZENDO QUE A VARIÁVEL NOME ESTÁ NA CLASSE PRINCIPAL
	}

	@Override
	public void falar() {
		System.out.println("Bom dia poderia me ajudar?");     //SÓ PARA ADICIONAR FRASE INICIAL
	}

	public String getCodCliente() {         //PARA RETORNAR O CÓDIGO DO CLIENTE           
		return codCliente;
	}

	public void setCodCliente(String codCliente) {      //PARA ARMAZENAR O CÓDIGO NA VARIÁVEL
		this.codCliente = codCliente;
	}

	public void comprar() {                           //SÓ PARA IMPRIMIR O TEXTO
		System.out.println("Compra efetuada!");
	}
	
}
