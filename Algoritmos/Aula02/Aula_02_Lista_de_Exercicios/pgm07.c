/*
Uma empresa tem para um determinado funcion�rio uma ficha contendo o n�mero de horas trabalhadas e 
o n0
de dependentes.
Considerando que:
a) A empresa paga 12 reais por hora e 40 reais por dependentes, isto � o sal�rio bruto.
b) Sobre o sal�rio bruto s�o feitos descontos de 8,5% para o INSS e 5% para IR.
Fa�a um programa para ler o n�mero de horas trabalhadas e n�mero de dependentes de um funcion�rio. 
Ap�s a leitura, escreva qual o sal�rio bruto, os valores descontados para cada tipo de imposto e 
finalmente qual o sal�rio l�quido do funcion�rio
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
