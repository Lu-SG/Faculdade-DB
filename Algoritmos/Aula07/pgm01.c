/*
Escrever um programa que leia a temperatura corporal de 10 indivíduos.
Para cada um mostrar a mensagem:
c/ febre s/ - febre. Considere 37.5 p/ temperatura de febre
Mostre a quantidade de indivíduos c/ febre e s/ febre
Mostrar a media das temperaturas lidas 
*/
#include <stdio.h>

int main (void)
{
	float tempcorp, media, mediacomfebre, mediasemfebre;
	float somatemp=0;
	float somatempcomfebre=0;
	float somatempsemfebre=0;
	
	int cont;
	int comfebre=0;
	int semfebre=0;
	
	
	for (cont=0;cont<10;cont++)
	{
		printf("\nPor favor, informe a sua temperatura corporal\n");
		scanf("%f",&tempcorp);
		
		somatemp=tempcorp+somatemp;
		
		if (tempcorp<=37.5)
		{
			printf("Você não esta com febre");
			semfebre++;
			somatempsemfebre=tempcorp+somatempsemfebre;
			
		}
		else
		{
			printf("Você esta com febre");
			comfebre++;
			somatempcomfebre=tempcorp+somatempcomfebre;
		}
	}
	
	media = somatemp/cont;
	mediasemfebre = somatempsemfebre/semfebre;
	mediacomfebre = somatempcomfebre/comfebre;
	
	printf("\nSem febre [%d]\n",semfebre);
	printf("Com febre [%d]\n",comfebre);
	printf("\nMedia temperatura [%f]\n",media);
	printf("\nMedia temperatura sem febre [%f]\n",mediasemfebre);
	printf("\nMedia temperatura com febre [%f]\n",mediacomfebre);
}

