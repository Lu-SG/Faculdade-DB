/*
Ler um vetor que contenha as notas de uma turma de 6 alunos. Calcular a média destes 
6 alunos e contar quantos alunos obteve nota acima desta média calculada. Escrever a 
média da turma e o resultado da contagem
*/
#include <stdio.h>
#define MAX 6

int main(void)
{
	float nota[MAX];
	float somanotas = 0;
	float media;
	int cont;
	
	for(cont=1;cont<=MAX;cont++)
	{
		printf("Insira NOTA:\n");
		scanf("%f",&nota[cont]);
		
		somanotas = somanotas + nota[cont];
	}
	
	media = somanotas / MAX;
	
	printf("A Media foi de:[%f]\n",media);
	
	printf("Alunos com notas acima da media:\n");
	for(cont=1;cont<=MAX;cont++)
	{
		if(nota[cont]>media)
		{
			printf("[%f]\n",nota[cont]);	
		}
	}
	
}
