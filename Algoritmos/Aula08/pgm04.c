#include <stdio.h>
int main (void)
{
	int idade; 
	float media, maiormedia = -1;
	char resp;
	
	printf("Quer iniciar, S / N ?");
	scanf("%c",&resp);
	
	while (resp=='S')
	{
		printf("Informe a media");
		scanf("%f",&media);
		
		printf("Informe a idade");
		scanf("%d",&idade);
		
		if (media>maiormedia && idade>=20 && idade<=28)
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

