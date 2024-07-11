/*
Um sistema de equações lineares da forma: Ax + By = C Dx + Ey = F
Pode ser resolvido utilizando-se as seguintes fórmulas:
x = CE – BF e y = AF – CD
 _______ _______
AE – BD AE – BD 
Escreva um programa para ler o conjunto de coeficientes (A, B, C, D, E e F) e imprimir a solução, ou 
seja, os valores de x e y.
*/
#include <stdio.h>
int main(void)
{
	double A, B, C, D, E, F, X, Y;
	
	scanf("%lf",&A);
	scanf("%lf",&B);
	scanf("%lf",&C);
	scanf("%lf",&D);
	scanf("%lf",&E);
	
	X=((C*E)-(B*F))/((A*E)-(B*D));
	Y=((A*F)-(C*D))/((A*E)-(B*D));
	
	printf("%lf",X);
	printf("\n%lf",Y);
}
