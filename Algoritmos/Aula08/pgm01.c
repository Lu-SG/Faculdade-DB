#include <stdio.h>
int main (void)
{
	int cont;
	float n1, numeroalunos, mediafinal, somanotas, maiornota; 
	
	printf("Insira quantos alunos a turma possue\n");
	scanf("%f",&numeroalunos);
	
	maiornota = 0;
	
	printf("Calculadora de medias\n");
	
	for(cont=0;cont<numeroalunos;cont++)
	{
		printf("Favor, inserir nota do aluno\n");
		scanf("%f",&n1);
		
		if (n1>maiornota)
		{
			maiornota=n1;
		}
		somanotas = somanotas + n1;	
	}
	
	mediafinal = somanotas / numeroalunos;
	
	printf("A MEDIA da sala foi [%0.2f]\n[%0.1f] alunos no TOTAL\nMAIOR Nota foi [%0.1f]",mediafinal,numeroalunos,maiornota);
	
	
}

