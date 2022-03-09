//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

programa 
{
    
    funcao inicio() 
    {
    
        escreva("Escreva o valor de A: ")
        inteiro a
        leia(a)
        escreva("\nEscreva o valor de B: ")
        inteiro b
        leia(b)
        inteiro smt, media
        
        enquanto (a >= 0 e b >= 0) {
            
            smt = a + b
            media = (a + b) /2
            
            escreva("\nTotal do somatório: ", smt)
             escreva("\nmédia: ", media)
             limpa()
        }
        escreva("Fim do programa")
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */