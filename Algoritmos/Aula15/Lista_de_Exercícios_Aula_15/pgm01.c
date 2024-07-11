#include <stdio.h>
int main (void)
{
	int matriz[6][5];	
	int L;
	int C;
	int cont0;
	
	for(L=0;L<6;L++)
	{
		for(C=0;C<5;C++)
		{
			printf("Informe o valor:\n");
			scanf("%d",&matriz[L][C]);
		}
	}
	
	for(L=0;L<6;L++)
	{
		for(C=0;C<5;C++)
		{
			if(matriz[L][C] == 0)
			{
				cont0++;
			}
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
	
	printf("\nQuantidade de '0' = [%d]'",cont0);
	
}

