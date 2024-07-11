/*
Escrever um programa que calcule todos os números divisores por certo valor indicado 
pelo usuário (o resto da divisão por este número deve ser igual a zero), compreendidos em 
um intervalo também especificado pelo usuário. O usuário deve entrar com um primeiro 
valor correspondente ao divisor e após ele vai fornecer o valor inicial do intervalo, seguido 
do valor final deste intervalo. Exemplo de tela de saída: 

Entre com o valor do divisor: 3
Inicio do intervalo: 17
Fim do intervalo: 29
Números divisiveis por 3 no intervalo de 17 a 29 :
18 21 24 27
*/
#include <stdio.h>
int main (void)
{
	float divisor, inicio, fim, cont, limite, resto;
	
	limite = fim-inicio;
	
	printf("Entre com o valor do divisor\n");
	scanf("%f",&divisor);
	
	printf("Entre com o valor inicial do intervalo\n");
	scanf("%f",&inicio);
	
	printf("Entre com o valor final do intervalo\n");
	scanf("%f",&fim);
	
	printf("Numeros divisiveis no intervalo de [%0.2f] a [%0.2f]:",inicio,fim);
	
	for (cont=(int)inicio;cont<=(int)fim;cont++)
	{
		resto = (int)cont % (int)divisor;
		
		if (resto==0)
		{
			printf("\n%0.1f ",cont);
		}
		
	}
	
}
