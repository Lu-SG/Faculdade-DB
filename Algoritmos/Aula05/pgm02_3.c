/*
Uma loja de materiais de construção tem para cada cliente uma classificação  que fornece  desconto para as compras, conforme a tabela:
classificação|desconto
A				10%
B 				0.8%
C				0.5%
D				0.2%
===========================================
Escrever um programa que lê o valor das compras e a classificação  do cliente, mostrar o valor a pagar após o desconto.
*/
#include <stdio.h>
int main(void)
{
	float vlrcmpincial, vlrcmpfinal;
	char clsf;
	
	printf("Calculadora de venda loja de construcao");
	
	printf("\nFavor, inserir valor total da compra:");
	scanf(" %f",&vlrcmpincial);
	
	printf("\nFavor, inserir a classificacao do cliente [A,B,C,D]");
	scanf(" %c",&clsf);
	
	switch (clsf)
	{
		case('A'):
		{
			vlrcmpfinal=(float)vlrcmpincial-(vlrcmpincial*0.10);
			printf("%f",vlrcmpfinal);
			break;
		}
		case('B'):
		{
			vlrcmpfinal=(float)vlrcmpincial-(vlrcmpincial*0.08);
			printf("%f",vlrcmpfinal);	
			break;
		}
		case('C'):
		{
			vlrcmpfinal=(float)vlrcmpincial-(vlrcmpincial*0.05);
			printf("%f",vlrcmpfinal);
			break;
		}	
		case('D'):
		{
			vlrcmpfinal=(float)vlrcmpincial-(vlrcmpincial*0.2);
			printf("%f",vlrcmpfinal);
			break;
		}
		default:
		{
			printf("Valor invalido");
		}
	}
}

