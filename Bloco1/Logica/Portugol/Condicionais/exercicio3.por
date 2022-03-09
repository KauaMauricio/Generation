//Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
// Caso contrário, imprima os valores lidos e seus respectivos quadrados.

programa
{
	
	funcao inicio()
	{
	     escreva("(Vou calcular as raízes dos números escolhidos)\n")
	     escreva("Digite 4 números:\n ")
	
	     inteiro n1, n2, n3, n4
	     
		leia(n1)
		leia(n2)
		leia(n3)
		leia(n4)

          n1 = n1 * n1
          n2 = n2 * n2
          n3 = n3 * n3
          n4 = n4 * n4
          
		escreva("\nO quadrado do primeiro número: ", n1)
		escreva("\nO quadrado do segundoo número: ", n2)
		escreva("\nO quadrado do terceiro número: ", n3)
		escreva("\nO quadrado do quarto número: ", n4)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */