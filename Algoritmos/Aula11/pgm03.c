#include <stdio.h>
int main (void)
{
	int idade[5];	
	int cont;
	
	for(cont=0;cont<5;cont++)
	{
		printf("Insira idade:");
		scanf("%d",&idade[cont]);
	}
	for(cont=0;cont<5;cont++)
	{
		if(idade[cont] > 18)
		{
			printf("\nIdade:%d",idade[cont]);
		}
	}	
}

