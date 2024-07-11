/*
Uma empresa tem para um determinado funcionário uma ficha contendo o número de horas trabalhadas e 
o n0
de dependentes.
Considerando que:
a) A empresa paga 12 reais por hora e 40 reais por dependentes, isto é o salário bruto.
b) Sobre o salário bruto são feitos descontos de 8,5% para o INSS e 5% para IR.
Faça um programa para ler o número de horas trabalhadas e número de dependentes de um funcionário. 
Após a leitura, escreva qual o salário bruto, os valores descontados para cada tipo de imposto e 
finalmente qual o salário líquido do funcionário.
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
