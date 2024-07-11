/*
FACULDADE DOM BOSCO DE PORTO ALEGRE
* Sistemas de Informação – Análise e Desenvolvimento de Sistemas
* Algoritmos
*
* Programa PrimeiroT1: 
* -------------------------
* Objetivo do Programa: Calcular receita diária de um estacionamento qualquer seguindo regras fornecidas
* Autor: Lucas Silva Garcia
* Data da entrega do arquivo fonte: 24/03/2022 
*/
/*
O estacionamento de um shopping contratou sua empresa de software para desenvolver um 
programa que faça a totalização dos valores recebidos em um dia no seu estacionamento. 
Faça um programa que receba a quantidade total de tickets de estacionamento recebidos em um dia 
e o valor do estacionamento (considere tarifa única). Mostre o valor total arrecado pelo 
estacionamento.
Supondo que:
a) 60% dos tickets são pagos pelo convênio do supermercado que há no local e que para cada 
um desses tickets, o valor pago corresponde a 50% da tarifa;
b) 25% dos tickets são pagos por mensalistas e para cada um desses tickets, o valor pago 
corresponde a 70% da tarifa;
c) 10% dos tickets são pagos por frequentadores avulsos do shopping e para cada um desses 
tickets, o valor pago corresponde a 100% da tarifa;
d) 5% dos tickets são isentos e, portanto, não geram receita para o estacionamento.
*/
#include <stdio.h>
int main (void)
{
	double qnttickets, vlrtarifa, rctsuper,rctmensalistas, rctavulsos, rctisenta, rcttotal;
	
	printf("Calculadora de receita diaria estacionamento");
	printf("\nFavor, insira na ordem indicada os itens solicitados");
	
	//Entrada
	printf("\nQuantidade de tickets recebidos no dia\n");
	scanf("%lf",&qnttickets);
	
	printf("Valor da tarifa\n");
	scanf("%lf",&vlrtarifa);
	
	//Processamento dos Valores
	rctsuper=(qnttickets)*(vlrtarifa)*(0.60)*(0.5);
	rctmensalistas=(qnttickets)*(vlrtarifa)*(0.25)*(0.7);
	rctavulsos=(qnttickets)*(vlrtarifa)*(0.10)*(1);
	rctisenta=(qnttickets)*(vlrtarifa)*(0.00)*(0.05);
	rcttotal=rctsuper+rctmensalistas+rctavulsos+rctisenta;
	
	//Saídas
	printf("\nValor Super:%0.2lf",rctsuper);
	printf("\nValor Mensalistas:%0.2lf",rctmensalistas);
	printf("\nValor Avulsos:%0.2lf",rctavulsos);
	printf("\nValor Isento:%0.2lf",rctisenta);
	printf("\n\nValor TOTAL:%0.2lf",rcttotal);
	printf("\n\n Obrigado por utilizar esse programa");
}

