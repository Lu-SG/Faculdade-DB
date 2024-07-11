#include <stdio.h>
#define MAX 2
int main (void)
{
	int RG[MAX];
	int cont;
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira RG:\n");
		scanf("%d",&RG[cont]);
	}
	
	for(cont=0;cont<MAX;cont++)
	{
		printf("RG [%d]:\n",RG[cont]);
	}
}
