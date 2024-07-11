#include <stdio.h>
int main (void)
{
	int matriz[3][3];
	int L;
	int C;
	int somaprimeiralinha = 0;
	int produtoprimeiralinha = 1;
	int somatotal = 0;
	int cont;
	
	for(L=0;L<3;L++)
	{
		for(C=0;C<3;C++)
		{
			printf("Insira numero:\n");
			scanf("%d",&matriz[L][C]);	
		}	
	}
	
	for(L=0;L<1;L++)
	{
		for(C=0;C<3;C++)
		{
			somaprimeiralinha += matriz[L][C];	
		}	
	}
	
	for(L=0;L<1;L++)
	{
		for(C=0;C<3;C++)
		{
			produtoprimeiralinha = produtoprimeiralinha * matriz[L][C];	
		}	
	}
	
	for(L=0;L<3;L++)
	{
		for(C=0;C<3;C++)
		{
			somatotal += matriz[L][C];	
		}	
	}
	
	for(L=0;L<3;L++)
	{
		for(C=0;C<3;C++)
		{
			printf("[%d]",matriz[L][C]);
		}
		printf("\n");
	}
	
	printf("\nRESULTADOS:\n");
	printf("SOMA primeira linha:[%d]\nPRODUTO primeira linha[%d]\nSOMA total:[%d]\n",somaprimeiralinha,produtoprimeiralinha,somatotal);
	
	
	
}

