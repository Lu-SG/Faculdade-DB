/*Escrever um programa que leia 
dois números inteiros
mostrar o valor da soma dos numeros 
*/
#include <stdio.h>
int main(void)
{
	int um,dois,tres;
	
	printf("informe o numero");
	scanf("%d",&um);
	printf("informe outro numero");
	scanf("%d",&dois);
	
	tres=um+dois;
	
	printf("o resultado e %d",tres);
	printf("o resultado %d",um+dois);
}
