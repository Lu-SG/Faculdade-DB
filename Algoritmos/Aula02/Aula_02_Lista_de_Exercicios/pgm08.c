/*
Uma f�brica de camisetas produz os tamanhos pequeno, m�dio e grande, cada uma sendo vendida 
respectivamente por 10, 15, 18 reais. Construa um programa em que o usu�rio forne�a a quantidade de 
camisetas pequenas, m�dias e grandes vendidas. Informe o valor a ser cobrado
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
