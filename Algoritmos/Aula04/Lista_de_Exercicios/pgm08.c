/*
Escreva um programa para ler 3 valores e escrever a soma dos 2 maiores. Considere que 
o usuário não informará valores iguais. 
*/
#include <stdio.h>
int main (void)
{
	float n1, n2, n3, m1, m2, m3, soma;
	
	printf("insira 3 numeros");
	
	printf("\nN1");
	scanf("%f",&n1);
	
	printf("\nN2");
	scanf("%f",&n2);
	
	printf("\nN3");
	scanf("%f",&n3);
	
	if(n1>n2 && n1>n3 && n2>n3)
	{
		m1=n1;
		m2=n2;
		
		soma=m1+m2;
		
		printf("SOMA:%f",soma);
	}
	if(n1>n3 && n1>n2 && n3>n2)
	{
		m1=n1;
		m2=n3;
		
		soma=m1+m2;
		
		printf("SOMA:%f",soma);
	}
	
	if(n2>n1 && n2>n3 && n1>n3)
	{
		m1=n2;
		m2=n1;
		
		soma=m1+m2;
		
		printf("SOMA:%f",soma);
	}
	if(n2>n3 && n2>n1 && n3>n1)
	{
		m1=n1;
		m2=n3;
		
		soma=m1+m2;
		
		printf("SOMA:%f",soma);
	}
	
	if(n3>n2 && n3>n3 && n2>n1)
	{
		m1=n3;
		m2=n2;
		
		soma=m1+m2;
		
		printf("SOMA:%f",soma);
	}
	if(n3>n1 && n3>n2 && n1>n2)
	{
		m1=n3;
		m2=n1;
		
		soma=m1+m3;
		
		printf("SOMA:%f",soma);
	}
	
		
}
