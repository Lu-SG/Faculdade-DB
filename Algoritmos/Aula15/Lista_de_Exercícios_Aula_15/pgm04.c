#include <stdio.h>
int main (void)
{
	int matriz[6][5];
	int L;
	int C;	
	int contnegativos;
	int somaprimeiralinha;
	
	for(L=0;L<6;L++)
	{
		for(C=0;C<5;C++)
		{
			printf("Informe o valor:\n");
			scanf("%d",&matriz[L][C]);
			
			if(matriz[L][C] < 0)
			{
				contnegativos++; 
			}
		}
	}
	
	for(L=0;L<1;L++)
	{
		for(C=0;C<6;C++)
		{
			somaprimeiralinha += matriz[L][C];	
		}	
	}
	
	for(L=0;L<6;L++)
	{
		for(C=0;C<5;C++)
		{
			printf("[%d]",matriz[L][C]);
		}
		printf("\n");
	}
	
	printf("\nRESULTADOS:\n");
	printf("QUANTIDADE NUMEROS NEGATIVOS:[%d]\nSOMA primeira linha[%d]\n",contnegativos,somaprimeiralinha);
	
}

