/*
Um trabalhador comprou um fog�o em 3 presta��es. A taxa mensal de juros � de 2%. Fazer um 
programa que leia o valor a vista e mostre na tela as 3 presta��es no seguinte formato modelo:
*******************************
* Pre�o a vista : R$ 9999,99
* Pre�o a prazo: R$ 9999,99
*******************************
******************** 
 * Presta��o 1 : R$ 999,99
********************
******************** 
 * Presta��o 2 : R$ 999,99
********************
******************** 
 * Presta��o 3 : R$ 999,99
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
