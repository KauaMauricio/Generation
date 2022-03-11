public class Funcionario extends Pessoa {

	private String codFunc;
	private String cargo;

	public Funcionario(String codigo, String cargo, String nome) {    //DECLARANDO VARIÁVEIS QUE VÃO SER ARMAZENADAS DENTRO DE FUNCIONÁRIO
		this.cargo = cargo;           
		this.codFunc = codigo;       //ESTOU DIZENDO QUE A VARIÁVEL CARGO FOI DECLARADA AQUI 
		super.setNome(nome);         //ESTOU DIZENDO QUE A VARIÁVEL NOME ESTÁ NA CLASSE PRINCIPAL
	}

	public void atendender() {
		System.out.println(" está atendendo o cliente!");          //UMA MENSAGEM GUIA
	}

	public String getCodFunc() {         //PARA RETORNAR CÓDIGO DO FUNCIONÁRIO
		return codFunc;
	}

	public void setCodFunc(String codFunc) {         //PARA RAMAZENAR ESSE CÓDIGO NA VARIÁVEL CODFUNC
		this.codFunc = codFunc;
	}

	public String getCargo() {            //PARA RETONAR O CARGO INFORMADO PELO FUNCIONÁRIO
		return cargo;
	}

	public void setCargo(String cargo) {       //PARA ARMAZENAR O CARGO NA VARIÁVEL
		this.cargo = cargo;
	}

}