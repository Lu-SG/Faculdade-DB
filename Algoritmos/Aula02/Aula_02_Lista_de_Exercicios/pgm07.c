/*
Uma empresa tem para um determinado funcionário uma ficha contendo o número de horas trabalhadas e 
o n0
de dependentes.
Considerando que:
a) A empresa paga 12 reais por hora e 40 reais por dependentes, isto é o salário bruto.
b) Sobre o salário bruto são feitos descontos de 8,5% para o INSS e 5% para IR.
Faça um programa para ler o número de horas trabalhadas e número de dependentes de um funcionário. 
Após a leitura, escreva qual o salário bruto, os valores descontados para cada tipo de imposto e 
finalmente qual o salário líquido do funcionário
*/
#include <stdio.h>
int main(void)
{
	double horastrabalhadas, numerodedependentes, salariobruto, salarioliquido;
	
	printf("Calculadora de salario bruto de um funcionario\n");
	printf("Favor, inserir horas trabalhadas");
	scanf("%lf",&horastrabalhadas);
	
	printf("Favor, inserir numero de dependentes");
	scanf("%lf",&numerodedependentes);
	
	salariobruto=12*horastrabalhadas+40*numerodedependentes;
	salarioliquido=salariobruto*((float)8.5/100)*((float)5/100);
	printf("seu salario bruto e de:%lf",salariobruto);
	printf("seu salario liquido totaliza:%0lf",salarioliquido);
	
	
	
}
