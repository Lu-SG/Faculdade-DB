/*
Escrever um programa que l� as notas dos alunos de uma determinada classe e as 
armazena num vetor. Depois lista as notas que s�o menores que 5.0. O n�mero de 
alunos da classe � igual a 10
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
