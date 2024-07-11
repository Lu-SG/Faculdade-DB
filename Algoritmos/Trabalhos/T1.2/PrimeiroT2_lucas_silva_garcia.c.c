/* FACULDADE DOM BOSCO DE PORTO ALEGRE
* Sistemas de Informação – Análise e Desenvolvimento de Sistemas
* Algoritmos
*
* Programa PrimeiroT2: 
* -------------------------
* Objetivo do Programa: Entrada de 2 vetores A e B, gerado vetor C como saida.
* Autor: Lucas Silva Garcia
* Data da entrega do arquivo fonte: 06/06/2022
*/
#include <stdio.h>
#define MAX 10
int main (void)
{
	int A[MAX];
	int B[MAX];
	int C[MAX];
	int cont;
	
	// entrada de A[]
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira NUMERO INTEIRO:\n");
		scanf("%d",&A[cont]);
	}
	// entrada de B[]
	for(cont=0;cont<MAX;cont++)
	{
		printf("Insira NUMERO INTEIRO:\n");
		scanf("%d",&B[cont]);
	}
	// gerar C[] de 0 --> MAX / 2 
	// B[MAX -  cont + 1] (+1 utilizado para solucionar problema com o cont inicializado com 0;)
	for(cont=0;cont<MAX/2;cont++)
	{
		C[cont] = B[MAX - (cont + 1)];
	}
	// gerar C[] de MAX / 2 até MAX
	// A[cont] - cont; ( - cont para subtrair posição do vetor
	for(cont=MAX/2;cont<MAX;cont++)
	{
		C[cont] = A[cont] - cont;
	}
	
	// saida de dados / verificação das entradas
	printf("Valores de A:\n");
	for(cont=0;cont<MAX;cont++)
	{
		printf("[%d]\n",A[cont]);
	}
	
	printf("Valores de B:\n");
	for(cont=0;cont<MAX;cont++)
	{
		printf("[%d]\n",B[cont]);
	}
	
	printf("Valores de C:\n");
	for(cont=0;cont<MAX;cont++)
	{
		printf("[%d]\n",C[cont]);
	}
	
}
