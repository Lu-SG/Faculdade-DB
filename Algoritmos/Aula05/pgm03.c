#include <stdio.h>
int main(void)
{
	double numero1, numero2, resultado;
	char operacao;
	
	printf("Calculadora");
	
	printf("\nInsira o primeiro numero");
	scanf("%lf",&numero1);
	
	printf("\nInsira o segundo numero");
	scanf("%lf",&numero2);
	
	fflush(stdin);
	
	printf("\nInsira a operacao desejada [+,-,*,/]");
	scanf("%c",&operacao);
	
	switch(operacao)
	{
		case('+'):
		{
		resultado=(double)numero1+numero2;
		printf("%lf",resultado);
		break;
		}
		default:
		{
			printf("ERRO");
		}
	}
	}
	
	

