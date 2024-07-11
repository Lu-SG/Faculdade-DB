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
	
	if(media>=7.0&&qntlivros>=1)
	{
		printf("\nAprovado");
	}
	else
	{
		printf("\nReprovado");
	}	
}
