#include <stdio.h>
#define l 23
#define c 23
#define p 12
int main (void)
{
	int matriz[l][c];
	int ll, cc;
	int somavalores = 0;
	float mediavalores;
	float pontomedio;
	
	for(ll=0;ll<l;ll++)
	{
		for(cc=0;cc<c;cc++)
		{
			printf("Insira VALOR:\n");
			scanf("%d",&matriz[ll][cc]);
			if(cc == (p-1) || ll == (p-1))
			{
				somavalores += matriz[ll][cc];
			}
		}
	}
	
	mediavalores = somavalores / (l + c - 1); 
	
	for(ll=0;ll<l;ll++)
	{
		for(cc=0;cc<c;cc++)
		{
			printf("[%d]",matriz[ll][cc]);
		}
		printf("\n");
	}
	
	printf("RESULTADOS:\n SOMAVALORES[%d]\nMEDIAVALORES[%f]",somavalores,mediavalores);	
	
}

