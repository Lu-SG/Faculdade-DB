#include <stdio.h>
int main (void)
{
	int idade, servico, motivo;
	char sexo;
	int contiddroub = 0, contmasc = 0, contfem = 0, contmascmotperd = 0, contfemdocroub = 0;
	float permascmotperd;
	
	printf("Informe a sua idade ou 999 para finalizar!\n");
	scanf("%d",&idade);
	
	while (idade!=999)
	{
		
		printf("Informe seu sexo: [F] Feminino [M] Masculino\n");
		fflush(stdin);
		scanf("%c",&sexo);
		
		printf("Informe o servico desejado:\n[1] - carteira de identidade\n[2] - carteira de motorista\n");
		scanf("%d",&servico);
		
		printf("Informe o motivo:\n[1] - perca\n[2] - roubo\n");
		scanf("%d",&motivo);
		
		if(idade >= 15 && idade <= 18 && servico == 1 && motivo == 2)
		{
			contiddroub++;
		}
		
		if (sexo == 'M')
		{
			contmasc++;
		}
		
		if (sexo == 'F')
		{
			contfem++;
		}
		
		if (sexo == 'M' && servico == 2 && motivo == 1)
		{
			contmascmotperd++;	
		}
		
		if (sexo == 'F' && motivo == 2)
		{
			contfemdocroub++;			
		}
			
		printf("Informe a sua idade ou 999 para finalizar!\n");
		scanf("%d",&idade);
		
	}  	
	
	permascmotperd = ((float)contmascmotperd / contmasc)*100;
	
	printf("============================================================================\n");
	printf("--------Resultados do dia--------\n");
	printf("============================================================================\n");
	printf("Quantidade de carteiras de identidade roubadas de cidadaos entre 15 e 18 anos: [%d]\n",contiddroub);
	printf("Porcentagem de carteiras de motorista perdidas entre homens [%%%0.2f]\n",permascmotperd);
	printf("Quantidade de carteiras de identidadede e motorista roubadas entre mulheres [%d]\n",contfemdocroub);
	printf("============================================================================\n");
}

