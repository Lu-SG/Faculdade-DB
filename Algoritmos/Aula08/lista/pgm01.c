/*
Fazer um programa que leia um número indeterminado de idades. A última idade lida, que não 
entrará nos cálculos, contém o valor da idade igual a zero. Calcule e escreva a idade média deste 
grupo de indivíduos. 
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

