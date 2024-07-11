/*
Leia dois valores numéricos e escreva o menor valor.
*/
#include <stdio.h>
int main(void)
{
	double valor1, valor2;
	
	printf("Vamos descobrir qual e o menor valor");
	
	printf("\nPor favor, insira o primeiro valor");
	scanf("%lf",&valor1);
	
	printf("\nPor favor, insira o segundo valor");
	scanf("%lf",&valor2);
	
	if(valor2>valor1)
	{	
		printf("o menor valor e:%lf",valor1);
	}
	else
	{
		printf("o menor valor e:%lf",valor2);
	}
}
