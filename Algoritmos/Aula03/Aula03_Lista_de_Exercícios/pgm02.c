#include <stdio.h>
int main(void)
//Fa�a um programa que calcule e mostre a �rea de um trap�zio, Onde Trap�zio=((baseMaior + baseMenor) * altura) / 2
{
	float bsma, bsmn, alt, area;
	
	printf("Esse programa calcula a area de um trapezio \n");
	
	printf("por favor,digite a base maior do trapezio \n");
	scanf("%f",&bsma);
	
	printf("por favor,digite a base menor do trapezio \n");
	scanf("%f",&bsmn);
	
	printf("por fim, por favor, digite a base menor do trapezio \n");
	scanf("%f",&alt);
	
	area= ((bsma+bsmn)*(alt))/2;
	
	printf("A area desse trapezio equivale a: \n %f",area);
	
	
}
