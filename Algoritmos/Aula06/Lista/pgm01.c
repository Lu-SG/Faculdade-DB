/*
Ler 10 valores e escrever os valores que estão no intervalo [10, 20]
*/
#include <stdio.h>
int main (void)
{
	float n1, cont;
	
	for (cont=0;cont<10;cont++)
	{
	    printf("\nInsira um numero");
		scanf("%f",&n1);
		
		if (n1>=10 && n1<=20)
		{
			printf("\nINTERVALO");
		}
		else
		{
			printf("\nN 2INTERVALO");
		}
	}
}
