/*
Ler dois valores inteiros e escrever os inteiros ímpares entre os dois valores lidos. 
Considere que o segundo valor lido será sempre maior que o primeiro valor lido.
*/
#include <stdio.h>
int main (void)
{
	int n1, n2, cont, resto;
	
	printf("Insira n1:\n");
	scanf("%d",&n1); 
	
	printf("Insira n2:\n");
	scanf("%d",&n2); 
	
	for (cont=n1;cont<=n2;cont++)
	{
		resto = cont % 2;
		
		if (resto!=0)
		{
			printf("\n%d",cont);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
