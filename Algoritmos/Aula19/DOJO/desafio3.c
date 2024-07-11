#include <stdio.h>
#include <locale.h>
#define TAM 10

int main (){
	setlocale(LC_ALL,"Portuguese");
	
	int qtdAcima=0, qtdAbaixo=0;
	int vet[TAM], nrosAcimaMedia[TAM], nrosAbaixoMedia[TAM];
	int i, soma=0;
	float media;
	
	for(i=0;i<TAM;i++)
	{
		printf("Informe os valores:");
		scanf("%d",&vet[i]);
		soma+=vet[i];
	}
	
	media = soma / TAM;
	
	
	for(i=0;i<TAM;i++)
	{
		if(vet[i]>media)
		{
			nrosAcimaMedia[qtdAcima] = vet[i];
			qtdAcima++;
		}
		else
		{
			nrosAbaixoMedia[qtdAbaixo] = vet[i];
			qtdAbaixo++;
		}
	}
	
	printf("VETORES\n");
	for(i=0;i<TAM;i++)
	{
		printf("%d\n",vet[i]);	
	}
	printf("ACIMA\n");
	for(i=0;i<qtdAcima;i++)
	{
		printf("%d\n",nrosAcimaMedia[i]);	
	}
	printf("ABAIXO\n");
	for(i=0;i<qtdAbaixo;i++)
	{
		printf("%d\n",nrosAbaixoMedia[i]);	
	}	
	
	
	
}
