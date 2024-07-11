/*
escrever pgm que le o ano de nascm e verifica se pode votar ou não esse ano
idade>=16
*/
#include <stdio.h>
int main(void)
{
	int anodenasc, idadeuser;
	printf("Voce pode votar esse ano?\nInsira o ano que voce nasceu");
	scanf("%d",&anodenasc);
	
	idadeuser=(2022-anodenasc);
	
	if(idadeuser>=16)
	{
		printf("Voce pode votar esse ano :)");
	}
	else
	{
		printf("Voce nao pode votar esse ano :(");
	}
	
}

