//Fa�a um programa que leia 3 valores em vari�veis distintas, armazene a soma das duas primeiras em 
//uma nova vari�vel e o produto das duas �ltimas em outra, e mostre como resultado o produto das duas 
//novas vari�veis.

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
