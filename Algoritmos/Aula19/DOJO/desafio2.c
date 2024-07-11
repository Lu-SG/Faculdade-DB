#include <stdio.h>
#define tam 3

int main (void)
{
	int matriz[tam][tam];
	int l,c;
	int soma = 0;
	int qnt=-1;
	float media;
	int meio;
	
	meio=tam/2;
		
	printf("Insira valores matriz:\n");
	for(l=0;l<tam;l++)
	{
		for(c=0;c<tam;c++)
		{	
			scanf("%d",&matriz[l][c]);
			if(c==meio || l==meio)
			{
				soma += matriz[l][c];
				qnt++;	
			}		
		}	
	}
	
	media = ((float)soma-matriz[meio][meio]) / qnt;
	
	printf("\n%.2f",media);
}
