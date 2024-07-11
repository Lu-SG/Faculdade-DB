/*
Uma rede de lojas de departamento classifica seus clientes em 1, 2 e 3, de acordo com 
sua freqüência de compras e com isto recebe descontos. Ler o valor total da compra e 
classificação. Exibir o valor da compra, desconto e valor a ser pago. Sendo que clientes 
1 – 20% de desconto, clientes 2 – 15% de desconto e clientes 3 – 5%.
*/
#include <stdio.h>
int main (void)
{
	int clas;
	float valorinicial, valorfinal, desconto;
	
	printf("Loja do Joaquim");
	
	printf("\nInsira o valor total da compra");
	scanf("%f",&valorinicial);
	
	printf("\nInsira a classificacao do cliente [1,2,3] ");
	scanf("%d",&clas);
	
	switch(clas)
	{
		case(1):
		{
			desconto=(valorinicial)*0.2;
			break;
		}
		case(2):
		{
			desconto=(valorinicial)*0.15;
			break;
		}
		case(3):
		{
			desconto=(valorinicial)*0.05;
			break;
		}
		default:
		{
			printf("ERRO");
		}
	}
	
	valorfinal=valorinicial-desconto;
	
	printf("\nO valor total e:%0.2f",valorinicial);
	printf("\nO valor do desconto e:%0.2f",desconto);
	printf("\nO valor total com desconto e:%0.2f",valorfinal);
	
	
}

