/*
Ler o valor de uma compra e escrever o quanto dever� ser pago, supondo que esta compra ser� paga em 
trinta dias e ter� um acr�scimo de 0,39%
*/
#include <stdio.h>
int main(void)
{
	float valorcompraavista, valorcompraprazo;
				
	scanf("%f",&valorcompraavista);
	valorcompraprazo=valorcompraavista*100.39/100;
	printf("%f",valorcompraprazo);
	
}
