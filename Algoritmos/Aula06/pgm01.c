/*
Escreva um programa que leia o status de um imóvel. Mostrar mensagem de acordo com a tabela:
status / Mensagem
D          desocupado
O           ocupado 
*/
#include <stdio.h>
int main (void)
{
	char status;
	
	printf("Insira o status do imovel [O,D]");
	scanf("%c",&status);
	/*
	if (status=='O')
	{
		printf("OCUPADO");
	}
	else
	{
		printf("DESOCUPADO");
	}
	*/
	switch(status)
	{
		case('O'):
		{
			printf("OCUPADO");
			break;
		}
		case('D'):
		{
			printf("DESOCUPADO");
			break;
		}
		default:
		{
			printf("ENTRADA INVALIDA");
		}
			
	}
}
