/*
Fazer um programa que leia um n�mero indeterminado de idades. A �ltima idade lida, que n�o 
entrar� nos c�lculos, cont�m o valor da idade igual a zero. Calcule e escreva a idade m�dia deste 
grupo de indiv�duos. 
*/
#include <stdio.h>
int main (void)
{
	int idade, somaidade, numeroindividuos;
	float mediaidade;
	char resp;
	
	printf("Quer Continuar? S / N");
	scanf("%c",&resp);
	
	numeroindividuos = 0;
	
	while (resp=='S')
	{
		
		printf("Informe a sua idade:");
		scanf("%d",idade);
		
		numeroindividuos++;
		
		somaidade = somaidade + idade;
		
		fflush(stdin);
		
		printf("Quer Continuar? S / N");
		scanf("%c",&resp);
	}
	
	idade = 0;	
		
	mediaidade = somaidade /  numeroindividuos;
	
}

