/*
Fazer um programa que leia um conjunto de 8 notas de alunos de uma disciplina, e as 
armazena na variável nota. Determinar a maior nota.
*/
#include <stdio.h>
#define MAX 8

int main(void)
{
	float nota[MAX], maiornota = 0;
	int cont;
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira NOTA:\n");
		scanf("%f",&nota[cont]);
		if (nota[cont]>maiornota)
		{
			maiornota = nota[cont];
		}
	}
	
	printf("A Maior NOTA e:[%f]",maiornota);
	
	
}
