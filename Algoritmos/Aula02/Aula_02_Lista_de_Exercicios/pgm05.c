/*Efetuar o c�lculo da quantidade de litros de combust�vel gastas em uma viagem, utilizando-se um 
autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio dever� fornecer o tempo gasto na 
viagem e a velocidade m�dia durante a mesma. Desta forma, ser� poss�vel obter a dist�ncia percorrida 
com a f�rmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da dist�ncia, basta calcular a 
quantidade de litros de combust�vel utilizada na viagem com a f�rmula: LITROS = DISTANCIA / 12. O 
programa dever� apresentar os valores da velocidade m�dia, tempo gasto na viagem, � dist�ncia 
percorrida e a quantidade de litros utilizada na viagem.
*/
#include <stdio.h>
int main(void)
{
	int tempo, velocidademedia, distancia, combustivel;
	
	printf("Consumo de combustivel da viagem\n");
	
	printf("Por favor, informe o tempo gasto gasto durante o deslocamento");
	scanf("%d",&tempo);
	
	printf("Por favor, informe a velocidade m�dia do deslocamento");
	scanf("%d",&velocidademedia);
	
	distancia=tempo*velocidademedia;
	
	combustivel=distancia/12;
	
	printf("Seu consumo de combustivel foi de:%d",combustivel);
	
}
