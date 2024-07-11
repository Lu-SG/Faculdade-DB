#include <stdio.h>
#define ll 3
#define cc 3

int main ()
{
	float matriz[ll][cc];
	float vetor[cc];
	int l, c, cont, qntpositivos=0;
	float prcntpositivos=0;
	
	// entrada de dados da matriz
	
	printf("Insira Numero:\n");
	
	for(l=0;l<ll;l++)
	{
		for(c=0;c<cc;c++)
		{	
			scanf("%f",&matriz[l][c]);		
		}	
	}
	
	// lÊ SE É POSITIVO
	for(l=0;l<ll;l++)
	{
		for(c=0;c<cc;c++)
		{	
			//passa por todos os valores da linha e conta quantos são positivos
			if(matriz[l][c] > 0)
			{
				qntpositivos++;
			}
			
		}
		prcntpositivos = (((float)qntpositivos*100)/cc); 
		vetor[l] = prcntpositivos;	
		qntpositivos = 0;
	}
	
	//IMPRESSÃO
	for(l=0;l<ll;l++)
	{
		for(c=0;c<cc;c++)
		{
			printf("| %f |",matriz[l][c]);
		}
		printf("\n");
	}
	printf("\nVetor:\n");
	
	for(cont=0;cont<cc;cont++){
	
		printf("%.2f\t",vetor[cont]);
	}
}
