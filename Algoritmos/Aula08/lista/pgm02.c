/*
2. Escreva um programa para ler diversos n�meros e informar se o n�mero � par ou �mpar. Finalizar 
a leitura quando o usu�rio informar um flag de sa�da.
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
		printf("Informe seu n�mero:\n");
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
