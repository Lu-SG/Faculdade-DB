/*
Elaborar um programa que efetue a leitura de um n�mero inteiro e apresente uma 
mensagem informando se o n�mero � par ou �mpar
*/
#include <stdio.h>
int main (void)
{
	int numeroentrada;
	
	printf("Favor, insira um numero inteiro");
	scanf("%d",numeroentrada);
	
	if ((numeroentrada%2) == 0)
	{
		printf("o numero inserido e par");
	}
	else
	{
		printf("o numero inserido e impar");
	}
}


