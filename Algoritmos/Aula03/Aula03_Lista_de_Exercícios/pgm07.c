/*
 Escrever um programa para ler o salário mensal e o percentual de reajuste. Calcular e escrever o valor 
do novo salário
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
