//Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em 
//dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares 
//disponível com o usuário, para que seja apresentado o valor em reais
#include <stdio.h>
int main(void)
{
	double real, dolar,cotacao;
	
	printf("Esse programa e uma calcularadora de conversao de real para dolar \nsiga as instrucoes solicitadas corretamente para opera-la c");
	
	printf("insira valor do real disponivel");
	scanf("%lf",&real);
	
	printf("favor insira a cotação do dia, exemplo: 5.00");
	scanf("%lf",&cotacao);
	
	dolar= real/cotacao;
	printf("voce tem %lf",dolar);
}
