#include <stdio.h>
int main (void)
{
	int idade;
	
	printf("Informe a idade do individuo:");
	scanf("%d",&idade);
	
	do
	{
		if (idade > 18)
		{
			printf("O individuo e maior de idade\n");	
		}
		else 
		{
			printf("O individuo e menor de idade\n");
		}
		
		printf("Informe a idade do individuo ou 999 para encerrar a repeticao:");
		scanf("%d",&idade);
	}
	while (idade != 999);
}
	

