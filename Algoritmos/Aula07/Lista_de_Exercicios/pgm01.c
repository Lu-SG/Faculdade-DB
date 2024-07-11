/*
1. Ler dois valores inteiros X e Z, sendo que Z é maior do que X. Escrever os valores de Z 
até X, isto é, os valores do intervalo em ordem decrescente.
*/
#include <stdio.h>
int main (void)
{
	int x, y;
	int limite, cont;
	
	printf("Insira um numero\n");
	scanf("%d",&x);
	
	printf("Insira um numero, maior que o anterior digitado\n");
	scanf("%d",&y);	

	limite = y - x;

	for(cont=0;cont<=limite;cont++)
	{
		printf("%d\n",y--);
	}
}
