#include <stdio.h>
int main (void)
{
	int matriz[4][4];
	float matrizdivididos[4][4];
	float menornumero = 999;
	int L;
	int C;	
	
	for(L=0;L<4;L++)
	{
		for(C=0;C<4;C++)
		{
			printf("Informe o valor:\n");
			scanf("%d",&matriz[L][C]);
			
			if(matriz[L][C]<menornumero)
			{
				menornumero = matriz[L][C];
			}
		}
	}	
	
	for(L=0;L<4;L++)
	{
		for(C=0;C<4;C++)
		{
			matrizdivididos[L][C] = matriz[L][C] / menornumero;
		}
	}
	
	
	
	printf("\nRESULTADOS:\n");
	
	printf("MENOR NUMERO:[%f]\n",menornumero);
	
	printf("\nORIGINAL:\n");
	for(L=0;L<4;L++)
	{
		for(C=0;C<4;C++)
		{
			printf("[%d]",matriz[L][C]);
		}
		printf("\n");
	}
	
	printf("\nORIGINAL / MENOR NUMERO:\n");
	for(L=0;L<4;L++)
	{
		for(C=0;C<4;C++)
		{
			printf("[%f]",matrizdivididos[L][C]);
		}
		printf("\n");
	}
	
	
	
}

