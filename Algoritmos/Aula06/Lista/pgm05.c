/*
Ler um n�mero inteiro e apresentar os resultados da tabuada para o n�mero lido. A 
apresenta��o dever� estar com o formato abaixo. Exemplo para o n�mero informado 2.
(tabuada do dois)
*/
#include <stdio.h>
int main (void)
{
	int n1, cont, multiplicacao, multiplicador, resultado;
	
	printf("Insira n1:\n");
	scanf("%d",&n1);
	
	for (cont=1;cont<=10;cont++)
	{
		multiplicador = cont;
		
		resultado = n1 * multiplicador;
		
		printf("%d X %d = %d\n",multiplicador,n1,resultado);
	}
	 
}


