/*
2. Escreva um programa para ler diversos números e informar se o número é par ou ímpar. Finalizar 
a leitura quando o usuário informar um flag de saída.
*/
#include <stdio.h>
int main(void)
{
	int n1;
	char resp;
	
	printf("Quer Continuar? S / N");
	scanf("%c",&resp);
	
	while (resp =='S')
	{
		printf("Informe seu número:\n");
		scanf("%d",&n1);
				
		if (n1 % 2 == 0)
		{
			printf("\nPAR");
		}
		else
		{
			printf("\nIMPAR");
		}
		
		fflush(stdin);

		printf("\nQuer Continuar? S / N");
		scanf("%c",&resp);	
	}
	
}
