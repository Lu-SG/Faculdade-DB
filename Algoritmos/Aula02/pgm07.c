/*
Uma empresa tem para um determinado funcion�rio uma ficha contendo o n�mero de horas trabalhadas e 
o n0
de dependentes.
Considerando que:
a) A empresa paga 12 reais por hora e 40 reais por dependentes, isto � o sal�rio bruto.
b) Sobre o sal�rio bruto s�o feitos descontos de 8,5% para o INSS e 5% para IR.
Fa�a um programa para ler o n�mero de horas trabalhadas e n�mero de dependentes de um funcion�rio. 
Ap�s a leitura, escreva qual o sal�rio bruto, os valores descontados para cada tipo de imposto e 
finalmente qual o sal�rio l�quido do funcion�rio.
*/
#include <stdio.h>
int main(void)
{

float horastb, numerodp, salariobt, salariolq;

printf("Calculadora de salario\n");

printf("Informe o numero de horas trabalhadas");
scanf("%f",&horastb);

print("Informe o numero de dependentes");
scanf("%f",&numerodp);

salariobt=(12.horastb)+(40.numerodp);
salariolq=salariobt-(salariobt*0.085);

printf("%f",salariolq);
}
