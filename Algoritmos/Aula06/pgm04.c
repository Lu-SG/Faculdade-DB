#include <stdio.h>
int main (void)
{
	int numero, cont;
	
	for (cont=0;cont<3;cont++)
	{
		printf("\nInforme um numero");
	 	scanf("%d",&numero);
	
	 	if(numero%3==0)
	 	{
		 	printf("o numero e multiplo de 3");
	  	}
	 	else 
	 	{
			printf("o numero nao e multiplo de 3");
	  	}
	}
}
/*
	printf("Informe um numero");
	scanf("%d",&numero);
	
	
	if(numero%3==0)
	{
		printf("o numero e multiplo de 3");
	 }
	else
	{
		printf("o numero nao e multiplo de 3");
	 }
	
	printf("Informe um numero");
	scanf("%d",&numero);
	
	if(numero%3==0)
	{
		printf("o numero e multiplo de 3");
	 }
	else
	{
		printf("o numero nao e multiplo de 3");
	 }
	
	printf("Informe um numero");
	scanf("%d",&numero);
	
	if(numero%3==0)
	{
		printf("o numero e multiplo de 3");
	 }
	else
	{
		printf("o numero nao e multiplo de 3");
	 }
	 
	 
	*/
