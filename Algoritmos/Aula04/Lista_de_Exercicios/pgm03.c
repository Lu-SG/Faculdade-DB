/*
Escreva um programa para ler um valor e escrever se é positivo ou negativo. Considere 
o zero como neutro, ou seja, se for digitado o valor zero, escrever a palavra zero.
*/
#include <stdio.h>
int main (void)
{
	float valor;
	
	printf("Insira um numero");
	scanf("%f",&valor);
	
	if (valor>0 && valor!=0)
	{
		printf("POSITIVO");
	}
	else
	{
		if (valor<0 && valor!=0)
		{
			printf("NEGATIVO");
		}
		else
		{
			printf("ZERO");
		}
	}
}
