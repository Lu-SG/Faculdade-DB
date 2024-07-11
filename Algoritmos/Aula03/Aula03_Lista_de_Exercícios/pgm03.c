//Faça um programa que leia 3 valores em variáveis distintas, armazene a soma das duas primeiras em 
//uma nova variável e o produto das duas últimas em outra, e mostre como resultado o produto das duas 
//novas variáveis.

#include <stdio.h>
int main(void)
{
	int um, dois, tres, quatro, cinco, seis;
	
	printf("insira um numero\n");
	scanf("%d",&um);
	
	printf("insira um numero\n");
	scanf("%d",&dois);
	
	printf("insira um numero\n");
	scanf("%d",&tres);
	
	quatro=um+dois;
	cinco=dois*tres;
	seis=quatro*cinco;
	
	printf("o resultado de seis e:%d",seis);
}
