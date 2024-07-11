/*
O preço de um automóvel é calculado pela soma do preço de fábrica com o preço dos impostos (45% do 
preço de fábrica) e a percentagem do revendedor (28% do preço de fábrica). Faça um programa que leia o
preço de fábrica e imprima o seu preço final
// (float) - casting 

*/
#include <stdio.h>
int main(void)
{
	float custofb, custoimp, custorvd, preco;

	printf("Calculadora de preco automovel");
	printf("Por favor, insira o preco de fabrica\n");
	scanf("%f",&custofb);

	custoimp=custofb*((float)45/100);
	custorvd=custofb*((float)28/100);
	preco=custofb+custoimp+custorvd;

	printf("%f",preco);
}
