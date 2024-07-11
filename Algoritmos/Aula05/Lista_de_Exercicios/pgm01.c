/*
1. Elabore um programa que recebe a idade de um nadador. O programa deve classificar o 
nadador em uma das categorias abaixo:
Infantil A = de 5 a 7 anos,
Infantil B = de 8 a 10 anos,
Juvenil A = de 11 a 13 anos,
Juvenil B = de 14 a 17 anos,
Senior = maiores de 18 anos.
*/
#include <stdio.h>
int main (void)
{
	int idade;
		
	printf("Favor, insira a sua idade");
	scanf("%d",&idade);	
	
	if (idade>=5 && idade<=7)
	{
		printf("Infantil A");
	}
	
	if (idade>=8 && idade<=10)
	{
		printf("Infantil B");
	}
	
	if (idade>=11 && idade<=13)
	{
		printf("Juvenil A");
	}
	
	if (idade>=14 && idade<=17)
	{
		printf("Juvenil B");
	}
	
	if (idade>=18)
	{
		printf("Senior");
	}

}
