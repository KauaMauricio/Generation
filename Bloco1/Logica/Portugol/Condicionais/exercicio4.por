//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
//número é par ou ímpar, e se é positivo ou negativo.

programa
{
	
	funcao inicio()
	{
               inteiro x
               
	          escreva("Brincadeira par ou ímpar\n")
			escreva("\nDigite um número: ")
			leia(x)

			se (x > 0 e x %2 == 0) {
				escreva("O número é positivo e par")
			}
			
			senao se (x > 0 e x %2!= 0) {
				escreva("O número é positivo e ímpar")
			}
			
			senao se (x < 0 e x %2 == 0) {
				escreva("O número é negativo e par")
			}
			
			senao se(x < 0 e x %2 != 0) {
				escreva("O número é negativo e ímpar")
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 87; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */