/*
Escrever um programa para calcular o volume de uma lata de refrigerante, lembre-se que a fórmula é:
VOLUME = PI * R * R * altura, onde PI = 3.14159
*/
#include <stdio.h>
int main (void)
{
	float raio, altura, pi, volume; 
	
	printf("Calculadora de volume de uma lata de refrigerante");
	
	printf("\n Insira o raio da lata de refrigerante");
	scanf("%f",&raio);
	
	printf("\n Insira a altura da lata de refrigerante");
	scanf("%f",&altura);
	
	pi=3.14159;
	
	volume=pi*raio*raio*altura;
	
	printf("O volume da latinha é: %0.5f",volume);
}
