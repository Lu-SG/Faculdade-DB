

/*
Fazer um programa que tem dois vetores do mesmo tamanho (6). O usu�rio fornecer� 
os dados do primeiro, e depois dever� ser armazenado e exibido o valor do segundo 
vetor que � o valor do primeiro vetor somado a posi��o do elemento
*/
#include <stdio.h>
#define MAX 6
int main (void)
{
	int vetor[MAX], vetor2[MAX];
	int cont;
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Informe NUMERO:\n");
		scanf("%d",&vetor[cont]);
	}
	for(cont=0;cont<MAX;cont++)
	{
		vetor2[cont] = vetor[cont] + cont;
	}
	for(cont=0;cont<MAX;cont++)
	{
		printf("\nPOSICAO[%d] VALOR [%d]",cont,vetor2[cont]);
	}
}
