/*
Escrever um programa que l� um n�mero inteiro e informe se o n�mero lido � multiplo de 3;
*/

#include <stdio.h>
int main (void)
{
	int numero,resto;
	
	printf("Informe um numero");
	scanf("%d",&numero);
	
	resto=numero%3;
	
	/*
	if(resto==0)
	{
		printf("o numero e multiplo de 3");
	 }
	else
	{
		printf("o numero nao e multiplo de 3");
	 }
	*/
	switch(resto)
	{
		case(0):
		{
			printf("o numero e multiplo de 3");
			break;		
		}
		default:
		{
		printf("o numero nao e multiplo de 3");
		}
	}
	
}
