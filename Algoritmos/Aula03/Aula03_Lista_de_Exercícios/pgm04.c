//Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em 
//d�lar. O programa deve solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares 
//dispon�vel com o usu�rio, para que seja apresentado o valor em reais
#include <stdio.h>
int main(void)
{
	double real, dolar,cotacao;
	
	printf("Esse programa e uma calcularadora de conversao de real para dolar \nsiga as instrucoes solicitadas corretamente para opera-la c");
	
	printf("insira valor do real disponivel");
	scanf("%lf",&real);
	
	printf("favor insira a cota��o do dia, exemplo: 5.00");
	scanf("%lf",&cotacao);
	
	dolar= real/cotacao;
	printf("voce tem %lf",dolar);
}
