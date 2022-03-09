//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.

programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	     
	     inteiro n1[4][6], m1[4][6], m2[4][6]
		inteiro n2[4][6]

          para (inteiro l = 0; l < 4; l++) {
          	
          	para (inteiro c = 0; c < 6; c++) {
          		 n1[l][c] = Util.sorteia(0,15)
          		 n2[l][c] = Util.sorteia(0,15)
          	}
          }
   
          para (inteiro l = 0; l < 4; l++) {

          	para (inteiro c = 0; c < 6; c++) {
          	       m1[l][c] = n1[l][c] + n2[l][c]
          		  m2[l][c] = n1[l][c] - n2[l][c]
          	}
          }
        
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 14, 2}-{m1, 13, 24, 2}-{m2, 13, 34, 2}-{n2, 14, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */