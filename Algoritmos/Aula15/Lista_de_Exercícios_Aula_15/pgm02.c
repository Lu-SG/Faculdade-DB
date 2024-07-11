#include <stdio.h>
int main (void)
{
	int matriz[3][3];
	int L;
	int C;
	int maiornumero = 0;
	for(L=0;L<3;L++)
	{
		for(C=0;C<3;C++)
		{
			printf("Informe o valor:\n");
			scanf("%d",&matriz[L][C]);
			
			if(matriz[L][C] > maiornumero)
			{
				maiornumero = matriz[L][C]; 
			}
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
	
	printf("O maior numero e [%d]",maiornumero);
	
	
}

