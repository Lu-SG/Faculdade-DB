/*Efetuar o cálculo da quantidade de litros de combustível gastas em uma viagem, utilizando-se um 
automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deverá fornecer o tempo gasto na 
viagem e a velocidade média durante a mesma. Desta forma, será possível obter a distância percorrida 
com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a 
quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS = DISTANCIA / 12. O 
programa deverá apresentar os valores da velocidade média, tempo gasto na viagem, à distância 
percorrida e a quantidade de litros utilizada na viagem.
*/
#include <stdio.h>
int main(void)
{
	int tempo, velocidademedia, distancia, combustivel;
	
	printf("Consumo de combustivel da viagem\n");
	
	printf("Por favor, informe o tempo gasto gasto durante o deslocamento");
	scanf("%d",&tempo);
	
	printf("Por favor, informe a velocidade média do deslocamento");
	scanf("%d",&velocidademedia);
	
	distancia=tempo*velocidademedia;
	
	combustivel=distancia/12;
	
	printf("Seu consumo de combustivel foi de:%d",combustivel);
	
}
