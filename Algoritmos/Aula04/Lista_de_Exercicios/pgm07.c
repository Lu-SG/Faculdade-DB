/*
Leia três valores numéricos e escreva o maior valor.
*/
#include <stdio.h>
int main (void)
{
	int n1, n2, n3;
	
	printf("Insira 3 numeros");
	
	printf("\nN1");
	scanf("%d",&n1);
	
	printf("\nN2");
	scanf("%d",&n2);
	
	printf("\nN2");
	scanf("%d",&n3);
	
	if(n1>n2 && n1>n3)
	{
		printf("MAIOR NUMERO:%d",n1);
	}
	if(n2>n1 && n2>n3)
	{
		printf("MAIOR NUMERO:%d",n2);
	}
	if(n3>n1 && n3>n2)
	{
		printf("MAIOR NUMERO:%d",n3);
	}
}
