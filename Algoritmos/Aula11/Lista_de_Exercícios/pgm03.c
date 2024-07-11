/*
Ler uma variável de 10 elementos numéricos e verificar se existe elementos iguais a 30. 
Se existirem, escrever as posições em que estão armazenadas.
*/
#include <stdio.h>
#define MAX 10
int main (void)
{
	int n1[MAX];
	int n1aux;
	int cont;
	
	//entrada de dados
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira numero:\n");
		scanf("%d",&n1aux);
		
		n1[cont] = n1aux;
	}
	// verificação se o valor dentro da posição do vetor == 30, caso verdade, saida = posição
	printf("Posicoes com valores iguais a 30:\n");
	for(cont=0;cont<MAX;cont++)
	{
		if(n1[cont]==30)
		{
			printf("%d\n",cont);
		}
	}
	
}
