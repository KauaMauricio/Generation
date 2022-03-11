public abstract class Pessoa {

	private String nome;

	public void falar() {                            //CRIANDO FUNÇÃO FALAR QUE EXIBE UMA MENSAGEM
		System.out.println("Bom dia tudo bem?");
	}

	public String getNome() {            //RETORNANDO O VALOR DE NOME INFORMADO
		return nome;
	}

	public void setNome(String nome) {            //ARMAZENANDO O DADO INFORMADO NA VARIAVEL NOME DA CLASSE
		this.nome = nome;
	}

}