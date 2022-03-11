public class Funcionario extends Pessoa {

	private String codFunc;
	private String cargo;

	public Funcionario(String codigo, String cargo, String nome) {    //DECLARANDO VARI�VEIS QUE V�O SER ARMAZENADAS DENTRO DE FUNCION�RIO
		this.cargo = cargo;           
		this.codFunc = codigo;       //ESTOU DIZENDO QUE A VARI�VEL CARGO FOI DECLARADA AQUI 
		super.setNome(nome);         //ESTOU DIZENDO QUE A VARI�VEL NOME EST� NA CLASSE PRINCIPAL
	}

	public void atendender() {
		System.out.println(" est� atendendo o cliente!");          //UMA MENSAGEM GUIA
	}

	public String getCodFunc() {         //PARA RETORNAR C�DIGO DO FUNCION�RIO
		return codFunc;
	}

	public void setCodFunc(String codFunc) {         //PARA RAMAZENAR ESSE C�DIGO NA VARI�VEL CODFUNC
		this.codFunc = codFunc;
	}

	public String getCargo() {            //PARA RETONAR O CARGO INFORMADO PELO FUNCION�RIO
		return cargo;
	}

	public void setCargo(String cargo) {       //PARA ARMAZENAR O CARGO NA VARI�VEL
		this.cargo = cargo;
	}

}