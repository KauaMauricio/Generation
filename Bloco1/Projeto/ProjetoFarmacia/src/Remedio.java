public class Remedio implements Produto {
	
	
	
	
	@Override
	public void excluir() {                                              //UTILIZANDO OS M�TODOS ABSTRATOS
		System.out.println("Produtos excluidos com sucesso!");

	}

	@Override
	public void adicionar() {                                            //PASSANDO INFORMA��ES...
		
		System.out.println("Produtos Cadastrados com sucesso!");
	}

	@Override
	public void atualizar() {
		System.out.println("Produtos atualizados com sucesso!");
		
	}

}