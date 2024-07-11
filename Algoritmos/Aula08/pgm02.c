#include <stdio.h>
int main (void)
{
	float media, idade, maiormedia = -1;
	
	printf("Informe a media ou 999 para sair");
	scanf("%f",&media);
	
	while (media!=999)
	{
		printf("Informe sua idade");
		scanf("%f",&idade);
		
		if (media>maiormedia && idade>=20 && idade<=28)
		{
			maiormedia = media;
		}
		
		printf("Informe a media ou 999 para sair");
		scanf("%f",&media);
	}
	if (maiormedia!=-1)
	printf("A MAIOR MEDIA foi de [%f]",maiormedia);
}

