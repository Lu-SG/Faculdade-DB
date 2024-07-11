/*
Escrever um programa que leia as duas notas de um aluno e escreve a média desse aluno.
*/
/*
Mostrar a mensagem APR 
*/
/*
Mostrar a mensagem


*/





#include <stdio.h>
int main(void)
{
	float nota1, nota2, qntlivros, media;
	
	printf("Calculadora de medias");
	
	printf("\nInsira a primeira nota");
	scanf("%f",&nota1);
	
	printf("\nInsira a segunda nota");
	scanf("%f",&nota2);
	
	printf("\nInsira a quantidade de livros retirados");
	scanf("%f",&qntlivros);
	
	media=(nota1+nota2)/2;
	
	printf("\na media do aluno e de:%0.1f",media);
	
	if(media>=7.0)
	{
		if(qntlivros>=1)
		{
			printf("\nAprovado");
		}
		else
		{
			printf("\nReprovado");	
		}
		
	}
	else
	{
		printf("\nReprovado");
	}
}
