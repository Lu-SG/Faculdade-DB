#include <stdio.h>
#define tamanho1 30
// não está a coisa mais linda do mundo, mas funciona :)
int main (void)
{
	int vetor1[tamanho1];
	int somanumeros = 0;
	float medianumeros;
	int qntacimamedia = 0, qntabaixomedia = 0;
	int cont;
	int aux1;
	int aux2;
	
	for(cont=0;cont<tamanho1;cont++)
	{
		printf("Insira Numero Inteiro:\n");
		scanf("%d",&vetor1[cont]);
		
		somanumeros += vetor1[cont];
	}
	
	medianumeros = (float)somanumeros/tamanho1;
	
	for(cont=0;cont<tamanho1;cont++)
	{
		if(vetor1[cont]>medianumeros)
		{
			qntacimamedia++;
			//printf("ACIMA[%d]\n",vetor1[cont]);	
		}
		
		if(vetor1[cont]<medianumeros)
		{
			qntabaixomedia++;
			//printf("ABAIXO[%d]\n",vetor1[cont]);	
		}	
	}
	
	int vetor2[qntacimamedia];
	int vetor3[qntabaixomedia];
	aux1 = qntacimamedia;
	aux2 = qntabaixomedia;
	
	for(cont=0;cont<tamanho1;cont++)
	{
		if(vetor1[cont]>medianumeros)
		{
			vetor2[aux1] = vetor1[cont];
			aux1--;	
		}
		else
		{
			vetor3[aux2] = vetor1[cont];
			aux2--;		
		}	
	}
	printf("VETORES:\n");
	
	printf("VETOR ENTRADA:\n");
	for(cont=0;cont<tamanho1;cont++)
	{
		printf("[%d]",vetor1[cont]);
	}
	
	printf("\nACIMA:\n");
	for(aux1=qntacimamedia;aux1>0;aux1--)
	{
		printf("[%d]",vetor2[aux1]);
	}
	
	printf("\nABAIXO:\n");
	for(aux2=qntabaixomedia;aux2>0;aux2--)
	{
		printf("[%d]",vetor3[aux2]);
	}
	
	//printf("A media e:[%f]\n A qnt acima:[%d]\n A qnt abaixo:[%d]",medianumeros,qntacimamedia,qntabaixomedia);
	printf("\nA media e:[%f]",medianumeros);
}

