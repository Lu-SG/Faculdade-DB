#include <stdio.h>
int main (void)
{
	int matriz[2][4];
	int L;
	int C;
	
	for(L=0;L<2;L++)
	{
		for(C=0;C<4;C++)
		{
			printf("Informe o valor:\n");
			scanf("%d",&matriz[L][C]);
		}
	}
	
	for(L=0;L<2;L++)
	{
		for(C=0;C<4;C++)
		{
			printf("[%d]",matriz[L][C]);
		}
		printf("\n");
	}
	
}

