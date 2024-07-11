/*
Escrever um programa que lê as notas dos alunos de uma determinada classe e as 
armazena num vetor. Depois lista as notas que são menores que 5.0. O número de 
alunos da classe é igual a 10
*/
#include <stdio.h>
#define MAX 4
int main (void)
{
	float nota[MAX];
	int cont;
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira NOTA:\n");
		scanf("%f",&nota[cont]);
	}
	
	printf("Lista de notas abaixo de 5.0:\n");
	
	for(cont=0;cont<MAX;cont++)
	{
		
		if(nota[cont]<5)
		{
			printf("%f\n",nota[cont]);
		}
	}




}
