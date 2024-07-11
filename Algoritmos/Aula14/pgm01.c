#include <stdio.h>
#include <string.h>
int main (void)
{
	char frase[31];
	char fraseaux[31];
	int tamanho;
	
		
	printf("Insira uma frase\n");
	scanf("%s",&frase);
	
	printf("A frase e:\n%s\n",frase);
	
	printf("Insira uma frase\n");
	// fflush necesssário para limpar buffer de entrada, pois ele armazena o resultado
	fflush(stdin);	
	gets(frase);
	
	printf("A frase e:\n");
	puts(frase);
	
	tamanho = strlen(frase);
	printf("A frase tem %d caracteres\n",tamanho);
	
	strncpy(fraseaux,frase,3);
	fraseaux[3] = '\0';
	
	printf("A fraseaux e:\n");
	puts(fraseaux);
	
}

