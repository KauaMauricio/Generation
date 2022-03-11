public class Cliente extends Pessoa {

	private String codCliente;   //PARA ARMAZENAR O C�DIGO DO CLIENTE DA LOJA

	public Cliente(String cod, String nome) {      
		this.codCliente = cod;                        //PARA PUXAR O C�DIGO DO CLIENTE
		super.setNome(nome);                   //ESTOU DIZENDO QUE A VARI�VEL NOME EST� NA CLASSE PRINCIPAL
	}

	@Override
	public void falar() {
		System.out.println("Bom dia poderia me ajudar?");     //S� PARA ADICIONAR FRASE INICIAL
	}

	public String getCodCliente() {         //PARA RETORNAR O C�DIGO DO CLIENTE           
		return codCliente;
	}

	public void setCodCliente(String codCliente) {      //PARA ARMAZENAR O C�DIGO NA VARI�VEL
		this.codCliente = codCliente;
	}

	public void comprar() {                           //S� PARA IMPRIMIR O TEXTO
		System.out.println("Compra efetuada!");
	}
	
}
