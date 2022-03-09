//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$100,00.

programa
{
   funcao inicio()

    {

        real totalE = 0.0, totalF = 0.0, maiorS = 0.0, salarioC = 0.0, totalS = 0.0
        real salario, mediaS, mediaF, percentual 
        inteiro x, qtdFilhs
        
        para(x=1; x<=20; x++){
            escreva("\nOlá ", x ,"° entrevistado.")

            totalE += 1 
            
            escreva("\nInforme seu salário: ")
            leia(salario)
            totalS = totalS + salario

            se(salario > maiorS){
                maiorS = salario
            }

            senao se(salario <= 100) {
                salarioC++
            }
            
            escreva("Digite a quantidade de filhos: ")
            leia(qtdFilhs)
            totalF = totalF + qtdFilhs
            
            escreva("Obrigado por preencher as informações!")
            
            limpa()
        }

        mediaS = totalS / totalE    
        mediaF = totalF / totalE
        percentual = (salarioC / totalE) * 100
        
        escreva("\nResultados:")
        escreva("\nMédia salarial = ", mediaS) 
        escreva("\nMédia do número de filhos = ", mediaF)
        escreva("\nMaior salário = ", maiorS)
        escreva("\nPercentual de pessoas com salário igual ou inferior a 100 reais = ", percentual + "%")
    }     

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */