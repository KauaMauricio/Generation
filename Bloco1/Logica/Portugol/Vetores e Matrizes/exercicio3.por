//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;

programa
{
	
	funcao inicio()
	{
		inteiro vet[3][3], soma = 0, c

		para(inteiro l = 0; l <3; l++) {
			para(c = 0; c < 3; c++) {
			escreva("\nEscreva o valor da linha ", l," da coluna", c, "\n")
			leia(vet[l][c])

			soma += vet[l][c]
			}
		}
		escreva("A soma total da matriz é: ", soma)
		escreva("\nA soma diagonal principal é: ", vet[0][0] + vet[1][1] + vet[2][2])
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */