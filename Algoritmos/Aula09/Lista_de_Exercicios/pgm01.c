/*
1. Escrever um programa para ler 10 números. Todos os números lidos com valores 
inferiores a 40 devem ser somados. Ao término da entrada de dados, escreva o valor final 
da soma.
*/
#include <stdio.h>
int main(void)
{
	float n1, somatotal = 0;
	int cont;
	
	for(cont=0;cont<10;cont++)
	{
		printf("Insira um numero:\n");
		scanf("%f",&n1);
		
		if(n1>40)
		{
			somatotal = somatotal + n1;
		}
	}
	printf("O Valor TOTAL da soma dos numeros > 40 e de [%f]",somatotal);
}
