/*
Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma 
mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o 
mês em que ela nasceu). 
*/
#include <stdio.h>
int main (void)
{
	int anodenascimento, anoeleicao;
	
	printf("Eleicoes, voce ira votar esse ano?, vamos descobrir");
	
	printf("\nInsira o ano que voce nasceu");
	scanf("%d",&anodenascimento);
	
	printf("\nInsira o ano atual, que ocorre eleicao");
	scanf("%d",&anoeleicao);
	
	if ((anoeleicao-anodenascimento)>=16) 
	{
		printf("Voce pode votar esse ano");
	}
	else
	{
		printf("voce nao pode votar esse ano");
	}
	
	
	
}



