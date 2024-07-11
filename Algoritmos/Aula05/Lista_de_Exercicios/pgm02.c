/*
2. Fazer um programa que imprime na tela a situação do aluno após a sua nota ser 
digitada. Baseie-se na tabela abaixo:
nota situação
de 1 a 2 = nota pessima 
de 3 a 4 = nota ruim
de 5 a 6 =  nota pouco ruim
7 = nota boa
8 a 9 = nota muito boa
10 = nota excelente 
*/
#include <stdio.h>
int main (void)
{
	float nota;
	
	printf("Insira Nota:\n");
	scanf("%f",&nota);
	
	if(nota>=1 && nota<=2)
	{
		printf("Nota pessima");	
	}
	
	if(nota>=3 && nota<=4)
	{
		printf("Nota ruim");	
	}
	
	if(nota>=5 && nota<=6)
	{
		printf("Nota pouco ruim");		
	}
	
	if (nota>=7 && nota<8)
	{
		printf("Nota Boa");
	}

	if(nota>=8 && nota<=9)
	{
		printf("Nota muito boa");		
	}
	
	if (nota>9 && nota<=10)
	{
		printf("Nota excelente");
	}
	
		
	
}
