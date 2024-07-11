/*
Leia dois números e calcule a soma e o produto entre eles, e a subtração e a divisão do 
primeiro valor com o segundo. Escreva o resultado na tela. Neste exercício, no segundo 
número poderá ser digitado o valor zero. Além disto, somente deve ser calculado o 
resultado da subtração quando ele não for negativo.
*/
#include <stdio.h>
int main (void)
{
	double n1, n2, som, sub, pro, div, resto;
	
	printf("Insira dois numeros");
	
	printf("\nInsira o primeiro numero");
	scanf("%lf",&n1);
	
	printf("\nInsira o segundo numero");
	scanf("%lf",&n2);
	
	som=n1+n2;
	sub=n1-n2;
	pro=n1*n2;
	div=n1/n2;
	resto=(int)n1%(int)n2;
	
	printf("\nSOMA:%lf",som);
	if ((sub)>=0)
	{
		printf("\nSUBTRACAO:%lf",sub);
	}
	else
	{
		printf("NUMERO INVALIDO");
	}
	printf("\nPRODUTO:%lf",pro);
	printf("\nDIVISAO:%lf\nRESTO:%lf",div,resto);
	
}
