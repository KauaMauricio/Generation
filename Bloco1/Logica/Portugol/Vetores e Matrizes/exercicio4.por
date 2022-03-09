//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//posição das matrizes N1 e N2.

programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], pont=0

			para(inteiro i=0; i<5; i++) 
		{
			escreva("Digite a pontuação da atividade: ", i, "\n")
			leia(vetor[i])
			
		se (vetor[i] > pont)
		{
			pont= vetor[i]
		}
		
		}	
			para (inteiro i=0; i<5; i++)		
		{
			escreva("\n", vetor[i])
		}

			escreva("O maior valor é:", pont)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */