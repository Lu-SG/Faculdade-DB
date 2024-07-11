/*
2. Tem-se um conjunto de dados contendo a altura e o sexo (m, f) de 50 pessoas. Fazer um 
programa que calcule e escreva:
• a maior e a menor altura do grupo;
• o número de homens.
*/
#include <stdio.h>
int main (void)
{
	float altmasc, altfem, maioralt = 0, menoralt = 3;	
	int sexo;
	int contmasc;
	int cont;
	int limite;
	
	limite = 50;
	
	for (cont=0;cont<limite;cont++)
	{
		printf("Insira Sexo [1] Masculino [2] Feminino\n");
		scanf("%d",&sexo);
		
		if (sexo==1)
		{
			printf("Insira Altura:\n");
			scanf("%f",&altmasc);
			
			if(altmasc<menoralt)
			{
				menoralt = altmasc;
			}
			if(maioralt<altmasc)
			{
				maioralt = altmasc;
			}
			
			contmasc++;		
		}

		if (sexo==2)
		{
			printf("Insira Altura:\n");
			scanf("%f",&altfem);
			
			if(altfem<menoralt)
			{
				menoralt = altfem;
			}
			if(altfem>maioralt)
			{
				maioralt = altfem;
			}		
		}
	}
	
	printf("A MENOR altura e [%f] e a MAIOR e [%f]\n",menoralt,maioralt);
	printf("Contagem de homens é de [%d]\n",contmasc);
	
}
	
