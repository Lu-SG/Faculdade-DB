/*
Ler o valor de uma compra e escrever o quanto deverá ser pago, supondo que esta compra será paga em 
trinta dias e terá um acréscimo de 0,39%
*/
#include <stdio.h>
int main(void)
{
	float valorcompraavista, valorcompraprazo;
				
	scanf("%f",&valorcompraavista);
	valorcompraprazo=valorcompraavista*100.39/100;
	printf("%f",valorcompraprazo);
	
}
