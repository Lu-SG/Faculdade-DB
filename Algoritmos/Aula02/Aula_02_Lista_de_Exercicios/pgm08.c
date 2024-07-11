/*
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida 
respectivamente por 10, 15, 18 reais. Construa um programa em que o usuário forneça a quantidade de 
camisetas pequenas, médias e grandes vendidas. Informe o valor a ser cobrado
*/
#include <stdio.h>
int main(void)
{
	int pequena, media, grande, valor;
	
	printf("Calculadora de valor de compra, favor insira, na ordem solicitida, quantiadade de cada tamanho escolhida");
	
	printf("\nPequena");
	scanf("%d",&pequena);
	
	printf("\nMedia");
	scanf("%d",&media);			
	
	printf("\nGrande");
	scanf("%d",&grande);

	valor=(pequena*10)+(media*15)+(grande*18);
	printf("O valor total da compra e de:%d reais",valor);
}
