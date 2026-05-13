programa
{
	
	funcao inicio(){
		
		real descontoDoDia
	     cadeia nomesClientes[6]
	     real gastosClientes[6]
	     real totalLoja
	     inteiro qtdComDesconto 
	     inteiro i = 0
		inteiro userDesconto = 0
		real ganhos = 0.0
	
		escreva("Qual o valor do desconto do dia?")
		leia(descontoDoDia)
		escreva("\n")
		escreva("-----------------")
		escreva("\n")
	     
		enquanto (i < 6){
			escreva("Qual o nome do cliente? ")
			leia(nomesClientes[i])
		
			escreva("Quanto ", nomesClientes[i], " gastou na loja? ")
			leia(gastosClientes[i])
			escreva("\n")
			
			i++
		}

		escreva("\n")
		escreva("\n")
		escreva("-----------------")
		escreva("\n")
		escreva("\n")

		para (inteiro a = 0; a < 6 ; a++){

			se (gastosClientes[a] < 100){
				escreva(nomesClientes[a], " NÃO recebeu o desconto.", "\n")
				escreva("Valor total: ", gastosClientes[a], "\n")
				escreva("\n")
				ganhos = ganhos + gastosClientes[a]
			} senao {
				escreva("-> ",nomesClientes[a], " recebeu desconto.", "\n")
				escreva("Valor total (com o desconto): ", (gastosClientes[a] - descontoDoDia), "\n")
				escreva("\n")
				userDesconto++
				ganhos = ganhos + (gastosClientes[a] - descontoDoDia)
			}
			
		}

		escreva("\n")
		escreva("\n")
		escreva("-----------------")
		escreva("\n")
		escreva("\n")
		escreva("Valor total recebido pela loja: ", ganhos, "\n")
		escreva("Quantos usuários tiveram desconto: ", userDesconto)
	}

}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */