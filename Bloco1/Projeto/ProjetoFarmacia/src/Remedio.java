public class Remedio implements Produto {
	
	
	
	
	@Override
	public void excluir() {                                              //UTILIZANDO OS MÉTODOS ABSTRATOS
		System.out.println("Produtos excluidos com sucesso!");

	}

	@Override
	public void adicionar() {                                            //PASSANDO INFORMAÇÕES...
		
		System.out.println("Produtos Cadastrados com sucesso!");
	}

	@Override
	public void atualizar() {
		System.out.println("Produtos atualizados com sucesso!");
		
	}

}