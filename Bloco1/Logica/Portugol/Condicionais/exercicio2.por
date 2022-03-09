//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
//excedente.

programa
{
	
	funcao inicio()
	{
		inteiro C, N, horaL = 50
		real exc, salarioT, E = 0, salario = 10.00, salarioExc = 20.00

		escreva("Escreva seu código de identificação: ")
		leia(C)
		escreva("Funcionário ", C, " teve quantas horas trabalhadas? ")
		leia(N)

		exc = N - horaL
		E = exc * salarioExc
		salarioT = E + (horaL * salario)

		escreva("\n")

		se(N > horaL) {
			escreva("Voce excedeu o limite de horas em ", exc, " horas \n")
			escreva("Seu salário vai ser de ", salarioT, " Reais \n")
			escreva("O valor excedente foi de ", E, "Reais \n")
		}
		senao {
			escreva("Seu salário total vai ser ", salarioT, " Reais  \n")
			escreva("O valor excedente foi de ", E, " Reais")

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */