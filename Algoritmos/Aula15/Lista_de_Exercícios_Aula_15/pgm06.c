#include <stdio.h>
int main (void)
{
	int matriz[5][5];
	int vetor1[5];
	int vetor2[5];
	int somacolunas = 0;
	int produtolinhas = 1;
	int L;
	int C;
	
	for(L=0;L<5;L++)
	{
		for(C=0;C<5;C++)
		{
			printf("Informe o valor:\n");
			scanf("%d",&matriz[L][C]);
		}
	}

	for(C=0;C<5;C++)
	{
		for(L=0;L<5;L++)
		{
			somacolunas += matriz[L][C];
		}
		vetor1[C] = somacolunas;
		
		somacolunas = 0;
	}
	
	for(L=0;L<5;L++)
	{
		for(C=0;C<5;C++)
		{
			produtolinhas = produtolinhas * matriz[L][C];
		}
		vetor2[C] = produtolinhas;
		
		produtolinhas = 1;
	}	
		
	
	printf("\nRESULTADOS:\n");
	
	printf("MATRIZ\n");
	for(L=0;L<5;L++)
	{
		for(C=0;C<5;C++)
		{
			printf("[%d]",matriz[L][C]);
		}
		printf("\n");
	}
	
	printf("VETOR 1 / SOMA\n");
	for(C=0;C<5;C++)
	{
		printf("[%d]",vetor1[C]);
	}	
	
	printf("\nVETOR 2 / PRODUTO\n");
	for(C=0;C<5;C++)
	{
		printf("[%d]",vetor2[C]);
	}	
	
	
}

