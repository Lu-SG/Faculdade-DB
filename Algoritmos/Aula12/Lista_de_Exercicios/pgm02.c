/*
Ler dois vetores: R de 5 elementos e S de 10 elementos. Gerar um vetor X de 15 
elementos cujas 5 primeiras posições contenham os elementos de R e as 10 últimas 
posições, os elementos de S. Escrever o vetor X
*/
#include <stdio.h>
#define MAXR 2
#define MAXS 4
#define MAXX 6

int main (void)
{
	int R[MAXR], S[MAXS], X[MAXX]; 
	int cont;
	
	for(cont=0;cont<MAXR;cont++)
	{
		printf("Insira Valores de R:\n");
		scanf("%d",&R[cont]);
	}
	
	for(cont=0;cont<MAXS;cont++)
	{
		printf("Insira Valores de S:\n");
		scanf("%d",&S[cont]);
	}
	
	for(cont=0;cont<MAXX;cont++)
	{
		if (cont<MAXR)
		{
			X[cont] = 1;
		}
		if (cont>=MAXR && cont<MAXS)
		{
			X[cont] = 0;
		}
	}
	
	for(cont=0;cont<MAXR;cont++)
	{
		printf("\nR[%d]",R[cont]);
	}
	
	for(cont=0;cont<MAXS;cont++)
	{
		printf("\nS[%d]",S[cont]);
	}
	
	for(cont=0;cont<MAXX;cont++)
	{
		printf("\nX[%d]",X[cont]);
	}
	
	
	
}
