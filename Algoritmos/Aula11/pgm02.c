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
		printf("\nIdade:%d",idade[cont]);
	}
}

