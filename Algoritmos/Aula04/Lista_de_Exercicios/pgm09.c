/*
(Questão de Trabalho) Leia três valores numéricos inteiros e escreva-os em ordem 
crescente. 
*/
#include <stdio.h>
int main (void)
{
	int n1, n2, n3, m1, m2, m3;

	printf("Organizadora de numeros em ordem crescente ");
	
	printf("\nInsira n1:");
	scanf("%d",&n1);
	
	printf("\nInsira n2:");
	scanf("%d",&n2);
	
	printf("\nInsira n3:");
	scanf("%d",&n3);
	
	if (n1<n2 && n1<n3 && n2<n3)
	{
		m1=n1;
		m2=n2;
		m3=n3;
		
		printf("\n%d\n%d\n%d",m1,m2,m3);
	}	
	if (n1<n3 && n1<n2 && n3<n2)
	{
		m1=n1;
		m2=n3;
		m3=n2;
		
		printf("\n%d\n%d\n%d",m1,m2,m3);
	}
	
	if (n2<n1 && n2<n3 && n1<n3)
	{
		m1=n2;
		m2=n1;
		m3=n3;
		
		printf("\n%d\n%d\n%d",m1,m2,m3);
	}	
	if (n2<n3 && n2<n1 && n3<n1)
	{
		m1=n2;
		m2=n3;
		m3=n1;
		
		printf("\n%d\n%d\n%d",m1,m2,m3);
	}
	
	if (n3<n2 && n3<n1 && n2<n1)
	{
		m1=n3;
		m2=n2;
		m3=n1;
		
		printf("\n%d\n%d\n%d",m1,m2,m3);
	}	
	if (n3<n1 && n3<n2 && n1<n2)
	{
		m1=n3;
		m2=n1;
		m3=n2;
		
		printf("\n%d\n%d\n%d",m1,m2,m3);
	}
	
}
