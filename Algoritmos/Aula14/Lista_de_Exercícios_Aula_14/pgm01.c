/*
Ler diversas palavras e determinar:
? Qual a palavra mais comprida e qual é esse comprimento,
? O comprimento médio de todas as palavras lidas,
? Quantas palavras iniciam pela letra a ou A.
Usar a palavra fim para indicar o fim da entrada de dados (flag), sendo que ela não entra 
nos cálculos.
*/
#include <stdio.h>
#include <string.h>
int main (void)
{
	char palavra[999];
	char maiorpalavra[999];
	char resp [3] = "Sim";
	char respentrada [3];
	int maiorcomprimento = 0;
	int somacomprimento;
	float media;
	
	printf("Voce deseja continuar? Sim / Nao\n");
	gets(respentrada);
	fflush(stdin);	
	
	while((strcasecmp(resp,respentrada)==0))
	{
		printf("Insira palavra:\n");
		gets(palavra);
		fflush(stdin);
		
		printf("A palavra e:\n");
		puts(palavra);
		
		somacomprimento += strlen(palavra);
		
		if (strlen(palavra)>=maiorcomprimento)
		{
			maiorpalavra [999] = palavra [999];
		}
		
		printf("Voce deseja continuar? Sim / Nao\n");
		gets(respentrada);
		fflush(stdin);	
	}

	printf("[%d]\n",somacomprimento);
	puts(maiorpalavra);
} 
