/*
 Escreva um programa para ler a quantidade de cavalos de uma fazenda e escreva quantas ferraduras são 
necessárias para equipar todos os cavalos da fazenda
*/
#include <stdio.h>
int main(void)
{
	int cavalos, ferraduras;
	
	printf("Calculadora de quantidade de ferraduras de uma fazenda");
	
	printf("\nFavor, inserir quantidade de cavalos presentes na fazenda");
	scanf("%d",&cavalos);
	
	ferraduras=cavalos*4;
	
	printf("A quantidade de ferraduras necessarias e:%d",ferraduras);
	
}
