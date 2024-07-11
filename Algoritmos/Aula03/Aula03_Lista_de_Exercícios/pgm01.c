#include <stdio.h>
int main(void)
//Faça um programa que receba o raio, calcule e mostre o comprimento de uma esfera, sabe-se que C=2*PI*R.
{
	float pi, raio, c;
	
	printf("Digite o seu raio");
	scanf("%f",&raio);
	
	pi= 3.14;
	c= 2*(pi*raio);
	
	printf("Seu raio e : %f",c);
}
