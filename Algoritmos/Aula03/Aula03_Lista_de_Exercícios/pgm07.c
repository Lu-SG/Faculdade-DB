/*
 Escrever um programa para ler o sal�rio mensal e o percentual de reajuste. Calcular e escrever o valor 
do novo sal�rio
*/
#include <stdio.h>
int main(void)
{
	float salario,reajuste,salarioreajustado;
	
	scanf("%f",&salario);
	scanf("%f",&reajuste);
	salarioreajustado=salario+(salario*reajuste);
	
	printf("%0.2f",salarioreajustado);
}
