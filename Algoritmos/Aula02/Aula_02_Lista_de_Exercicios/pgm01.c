/*
Elaborar um programa que leia a base e a altura de tri�ngulo e apresente a �rea deste tri�ngulo, lembre-se
que a f�rmula � AREA = (BASE * ALTURA) / 2.
*/
#include <stdio.h>
int main (void)
{
	int base, altura; 
	float area; 
	
	printf("Calculadora de area de um triangulo");
	
	printf("\n Insira a base:");
	scanf("%d",&base);
	
	printf("\n Insira a altura:");
	scanf("%d",&altura);
	
	area= (base*altura)/2;
	
	printf("\n a area de seu triangulo e:%0.2f",area);
}
