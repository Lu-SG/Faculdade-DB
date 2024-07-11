#include <stdio.h>
#define l 10
#define c 10

int main (void)
{
	int matriz[l][c];
	int ll, cc;		
	float vetor[l];
	int qntpositivos = 0;
	float perctpositivos;
	//ENTRADA E RESOLUÇÃO PROBLEMAS
	for(ll=0;ll<l;ll++)
	{
		for(cc=0;cc<c;cc++)
		{
			printf("Insira VALOR:\n");
			scanf("%d",&matriz[ll][cc]);
			
			if(matriz[ll][cc]>0)
			{
				qntpositivos++;	
			}
		}
		
		perctpositivos = ((float)qntpositivos / c)*100;
		vetor[ll] = perctpositivos;
		
		qntpositivos = 0;
	}
	//SAIDA
	for(ll=0;ll<l;ll++)
	{
		for(cc=0;cc<c;cc++)
		{
			printf("[%2d]",matriz[ll][cc]);
		}
		printf("\n");	
	}
	for(ll=0;ll<l;ll++)
	{
		printf("(%%)[%0.2f]\n",vetor[ll]);
	}
}

