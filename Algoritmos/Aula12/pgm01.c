#include <stdio.h>
#define MAX 2
// MAX e max - constante vs variav�l, boa pr�tica de programa��o
// # diretriz de programa��o 

int main (void)
{
	float salario[MAX], maiorsalario = 0;
	int cont; 
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Informe Salario:\n");
		scanf("%f",&salario[cont]);
		
		if(salario[cont]>maiorsalario)
		{
			maiorsalario = salario[cont];
		}
	}
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("SALARIO:[%f]\n",salario[cont]);
		printf("MAIOR SALARIO:[%f]\n",maiorsalario);
	}
	
}
