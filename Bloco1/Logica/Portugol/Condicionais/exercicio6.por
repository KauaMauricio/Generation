//Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
//categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos

programa
{
	
	funcao inicio()
	{
	     inteiro id
	     escreva("Descubra a categoria do nadador")
		escreva("\nDigite a idade do nadador: ")	
		leia(id)

		se (id > 4 e id < 8) {
			escreva("Infantil A")
		}
		senao se (id > 7 e id < 12) {
			escreva("Infantil B")
		}
		senao se (id > 11 e id < 14) {
			escreva("Juvenil A")
		}
		senao se (id > 13 e id < 18) {
			escreva("Juvenil B")
		}
		senao se (id > 18) {
			escreva("Adultos")
		}
		senao se (id < 4 ou id > 55) {
			escreva("idade inválida")
		}
		
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */