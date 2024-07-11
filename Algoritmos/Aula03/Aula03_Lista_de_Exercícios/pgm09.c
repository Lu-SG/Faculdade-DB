/*
Um trabalhador comprou um fogão em 3 prestações. A taxa mensal de juros é de 2%. Fazer um 
programa que leia o valor a vista e mostre na tela as 3 prestações no seguinte formato modelo:
*******************************
* Preço a vista : R$ 9999,99
* Preço a prazo: R$ 9999,99
*******************************
******************** 
 * Prestação 1 : R$ 999,99
********************
******************** 
 * Prestação 2 : R$ 999,99
********************
******************** 
 * Prestação 3 : R$ 999,99
********************
*/
#include <stdio.h>
int main(void)
{
	double valoravista, juros, valoraprazo;
	
	scanf("%lf",&valoravista);
	
	juros=((float)valoravista*0.03);
	
	valoraprazo=valoravista+juros;
	printf("%lf",valoraprazo);
}
