/*
3. Ler dois valores inteiros e escrever os inteiros ímpares entre os dois valores lidos. 
Considere que o segundo valor lido será sempre maior que o primeiro valor lido.
4. Alterar o exercício anterior, mas agora, considere que o segundo valor lido poderá ser 
maior ou menor que o primeiro valor lido.
*/
#include <stdio.h>
int main (void)
{
	int n1, n2, cont, resto;
	
	printf("Insira n1:\n");
	scanf("%d",&n1); 
	
	printf("Insira n2:\n");
	scanf("%d",&n2); 
	
	if (n2>n1)
	{
		for (cont=n1;cont<=n2;cont++)
		{
			resto = cont % 2;
		
			if (resto!=0)
			{
				printf("\n%d",cont);
			}
		
		}
	}
	else
	{
		for (cont=n2;cont<=n1;cont++)
		{
			resto = cont % 2;
		
			if (resto!=0)
			{
				printf("\n%d",cont);
			}
		
		}
	}	
}
