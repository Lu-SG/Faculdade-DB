/*
Escrever um programa que leia a quantidade de animais de uma fazenda e a quantidade de animais que pesam a mais do que 100kg.
Escrever o porcentual de animais que pesam mais do que 100kg e mostre a mensagem informando se a fazenda pode enviar o gado para abate
Sabendo que a fazenda  so pode enviar o gado para o abate  quando o porcentual de gado que pesa mais de 100kg for maior que 6.1%
*/
#include <stdio.h>
int main(void)
{
	int qntanimais, qntacima; 
	float peracima;
	
	printf("Abate de animais");
	
	printf("\nInsira a quantidade de animais presentes na fazenda");
	scanf("%d",&qntanimais);
	
	printf("\nInsira a quantidade de animais que pesam acima de 100kg presentes na fazenda");
	scanf("%d",&qntacima);
	
	peracima=(float)qntacima/qntanimais;
	
	printf("%0.2f",peracima);
	if (peracima>=0.061)
	{
		printf("\nAnimais podem ser enviados para abate");
	}
	else 
	{
		printf("\nPorcentagem insuficiente de animais acima de 100kg");
	}
}

