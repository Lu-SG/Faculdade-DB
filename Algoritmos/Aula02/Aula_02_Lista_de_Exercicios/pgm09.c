/*
Escrever um programa para ler o n�mero de eleitores de um munic�pio, o n�mero de votos brancos, nulos 
e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores.
*/
#include <stdio.h>
int main (void)
{
	int brancos, nulos, validos, totais;
	float pbrancos, pnulos, pvalidos;
	
	printf("Percentual eleitoral, favor insira numero de votos de acordo com categoria solicitada");
	
	printf("\nBrancos");
	scanf("%d",&brancos);
	
	printf("\nNulos");
	scanf("%d",&nulos);
	
	printf("\nvalidos");
	scanf("%d",&validos);
	
	totais=brancos+nulos+validos;
	pbrancos= ((float)brancos/totais);
	pnulos= ((float)nulos/totais);
	pvalidos= ((float)validos/totais);

	printf("Os resultados sao os seguintes:");
	printf("\nTotais:%d",totais);
	printf("\nBrancos:%f",pbrancos);
	printf("\nNulos:%f",pnulos);
	printf("\nValidos:%f",pvalidos);
}
	

