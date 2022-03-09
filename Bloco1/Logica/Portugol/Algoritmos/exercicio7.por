//Crie um sistema de equações lineares do tipo: ax+by=c   dx+ey=f, que pode ser resolvido 
//da seguinte forma..  x=ce-bf/ae-bd   y=af-ca/ae-bd  Escreva um sistema que lê os
//coeficientes a,b,c,d,e e f que calcula e mostra os valores de x e y.

programa
{
	
	funcao inicio()
	{
		real a, b, c, d, i, ib, f, fc, x, y
		escreva("entre com os valores de A, B, C, D, E e F: ")
		leia(a,b,c,d,i,f)
		ib = i+b
		fc = f+c
		x=(c*ib*f)/(a*ib*d)
		y=(a*fc*d)/(a*ib*d)
		escreva("\nOs valores de X e Y são respectivamente: ", x," e ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */