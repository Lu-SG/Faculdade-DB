/*
As laranjas custam R$ 0,50 cada se forem compradas menos do que uma dúzia, e R$ 
0,35 se forem compradas pelo menos doze. Escreva um programa que leia o número de 
laranjas compradas, calcule e escreva o valor total da compra.
*/
#include <stdio.h>
int main (void)
{
	int qntlaranjas;
	float valorcompra;
	
	printf("Vendinha do seu joaquim, favor inserir quantidade de laranjas compradas");
	scanf("%d",&qntlaranjas);
	
	if (qntlaranjas>=12)
	{
		valorcompra=(float)qntlaranjas*0.35;
		printf("Valor total da compra:%f",valorcompra);
	}
	else
	{
		valorcompra=(float)qntlaranjas*0.5;
		printf("Valor total da compra:%f",valorcompra);
	}
}
