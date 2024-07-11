/*
1. Ler diversas palavras e determinar:
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
	char palavramaiscomprida[999];
	char palavraaux[999];
	char palavraA [1] = "A";
	char resp_s1 [3] = "Sim";
	char resp_s2 [3];
	int maiorcomprimento = 0;
	int comprimento;
	int contpalavrasA;
	int somacomprimento;
	int resultado;
	int cont;
	int resp;
	float compmedio;
	
	fflush(stdin);
	printf("Quer iniciar, Sim / Nao?");
	gets(resp_s2);
	resp = strcasecmp(resp_s1,resp_s2);
	
	while(resp == 0)
	{
		fflush(stdin);
		printf("Insira uma palavra:\n");
		gets(palavra);
		
		
		comprimento = strlen(palavra);
		
		if(comprimento>maiorcomprimento)
		{
			maiorcomprimento = comprimento;	
			strcpy(palavramaiscomprida, palavra);
		}  
		
		somacomprimento = somacomprimento + comprimento;
		
		strncpy(palavraaux, palavra, 0);
		palavraaux[1] = '\0';
		
		resultado = strcasecmp(palavraA, palavraaux);
		
		if (resultado = 0)
		{
			contpalavrasA++;	
		}
		
		cont++;
		
		compmedio = (float)somacomprimento / cont;				
		
		fflush(stdin);
		printf("Quer iniciar, Sim / Nao ?");
		scanf("%s",&resp_s2);
		resp = strcasecmp(resp_s1,resp_s2);
		
	}
}

