#include <stdio.h>
int main (void)
{
	int vetor[20];
	int cont;
	int flag = 0;
	
	for(cont=0;cont<20;cont++)
	{
		printf("Insira numero");
		scanf("%d",&vetor[cont]);
	}
	
	for(cont=0;cont<20;cont++)
	{
		if(vetor[cont]==4)
		{
			printf("nro 4 na posicao [%d]",vetor[cont]);
			flag = 1;
		}	
	}
	
	if(flag == 0)
	{
		printf("Nao ha ocorrencias do nro 4");
	}
}

