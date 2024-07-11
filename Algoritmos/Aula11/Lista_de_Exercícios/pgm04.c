/*
Leia 4 números, coloque-os em um vetor e mostre-os na ordem inversa de sua leitura.
*/
#include <stdio.h>
#define MAX 4
int main (void)
{
	int n1[MAX];
	int cont;
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira numero:\n");
		scanf("%d",&n1[cont]);
	}
	for(cont=MAX-1;cont>=0;cont--)
	{
		printf("[%d]\n",n1[cont]);
	}
}
