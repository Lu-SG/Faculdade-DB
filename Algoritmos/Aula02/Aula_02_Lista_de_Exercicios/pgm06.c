/*
O pre�o de um autom�vel � calculado pela soma do pre�o de f�brica com o pre�o dos impostos (45% do 
pre�o de f�brica) e a percentagem do revendedor (28% do pre�o de f�brica). Fa�a um programa que leia o
pre�o de f�brica e imprima o seu pre�o final
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
