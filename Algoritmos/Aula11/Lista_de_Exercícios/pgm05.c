/*
Criar um vetor de 10 elementos inteiros. A seguir criar outro vetor onde todos os
números negativos deverão ser trocados por 0 (zero). Escrever os dois vetores.
*/
#include <stdio.h>
#define MAX 10
int main (void)
{
	int vetor1[MAX];
	int vetor2[MAX];
	int cont;
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira um numero inteiro:\n");
		scanf("%d",&vetor1[cont]);
	}
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira um numero inteiro:\n");
		scanf("%d",&vetor2[cont]);
		
		if(vetor2[cont]<0)
		{
			vetor2[cont] = 0;
		}
	}
	
	printf("Valores do 1 Vetor:\n");
	for(cont=0;cont<MAX;cont++)
	{
		printf("[%d]\n",vetor1[cont]);
	}
	
	printf("Valores do 2 Vetor:\n");
	for(cont=0;cont<MAX;cont++)
	{
		printf("[%d]\n",vetor2[cont]);
	}
}
