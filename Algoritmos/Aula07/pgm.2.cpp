/*
Escrever um programa que leia a altura de 8 individuos.
Mostrar o percentual de alturas maiores do que 1.80
Mostrar a maior altura da população
*/
#include <stdio.h>
int main (void)
{
	float altura, pctaltura, maioraltura, menoraltura;
	
	int cont;
	int qntmaiorque180 = 0;
	
	maioraltura = 0;
	menoraltura = 999;
	/*
	menoraltura = 0
	*/	
	for (cont=0;cont<8;cont++)
	{
		printf("Favor, insira a sua altura:\n");
		scanf("%f",&altura);
		
		if (altura>maioraltura)
		{
			maioraltura = altura;
		}
		/*
		if (menoraltura==0)
		{
			menoraltura = altura;
		}
		*/
		if (altura<menoraltura)
		{
			menoraltura = altura;
		}	
		if(altura>=1.80)
		{
			qntmaiorque180++;
		}	
	}
	
	pctaltura=(float)qntmaiorque180*100/cont;
	
	
	printf("Qnt de pessoas:[%d]\nQnt de pessoas que tem 1.80 ou mais:[%d]\nO percentual de pessoas que tem 1.80 m ou mais:[%0.2f]\nMaior Altura [%f]\nMenor Altura [%f]",cont,qntmaiorque180,pctaltura,maioraltura,menoraltura);
	
}

