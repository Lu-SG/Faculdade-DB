#include <stdio.h>
int main (void)
{
	float media, maiormedia = -1;
	char resp;
	
	printf("Quer iniciar, S / N ?");
	scanf("%c",&resp);
	
	while (resp=='S')
	{
		printf("Informe a media");
		scanf("%f",&media);
		
		if (media>maiormedia)
		{
			maiormedia = media;
		}
		
		printf("Quer iniciar, S / N ?");
		fflush(stdin);
		scanf("%c",&resp);
	}
	if (maiormedia!=-1)
	printf("A MAIOR MEDIA foi de [%f]",maiormedia);
	
	
	
}

