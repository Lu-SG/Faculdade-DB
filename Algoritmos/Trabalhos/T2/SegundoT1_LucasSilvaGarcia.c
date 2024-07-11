/*
FACULDADE DOM BOSCO DE PORTO ALEGRE
* Sistemas de Informação – Análise e Desenvolvimento de Sistemas
* Algoritmos
*
* Programa SegundoT1: 
* -------------------------
* Objetivo do Programa: 
Recolher de um determinado posto dados oriundos de suas triagens (idade, sexo e triagem (covid,dengue e gripe comum))
E apresentar os seguintes dados:

//quantidade de pacientes masculinos e femininos atendidos na pediatria (menores de 18 anos);
//quantidade de pacientes acima de 70 anos com COVID;
//média de idade dos atendimentos com DENGUE;
//qual foi a triagem que teve o maior número de atendimentos.

* Componentes do grupo: Lucas Silva Garcia
* Data da entrega do arquivo fonte: 17/04/2022 
*/
#include <stdio.h>
int main (void)
{
	int cont, atendimentos, sexo, idade, triagem;
	int contsexofeminino, contsexomasculino, conttriagemcovid, conttriagemdengue, conttriagemgripecomum; 
	int qntatendidospediatria, qnta70anoscovid, maiornumeroatendimentos;
	
	float mediaatendimentoscovid;
	
	atendimentos = 180;
	
	contsexofeminino = 0;
	
	contsexomasculino = 0;
	
	conttriagemcovid = 0;
	
	conttriagemdengue = 0;
	
	conttriagemgripecomum = 0;
	
	printf("POSTO DE SAUDE\nTRIAGEM");
	printf("\n========================================================================================================");
	for (cont=0;cont<atendimentos;cont++)
	{
		printf("\nInicio da triagem, favor inserir valores condigentes as condicoes descritas na legenda");
		printf("\n========================================================================================================");	
		
		printf("\nIDADE:\n");
		scanf("%d",&idade);
		
		printf("\nSEXO:\n[1] - FEMININO\n[2] - MASCULINO\n");
		scanf("%d",&sexo);
		
		printf("\nTRIAGEM:\n[1] - COVID\n[2] - DENGUE\n[3] - GRIPE COMUM\n");
		scanf("%d",&triagem);
		
		if (idade<18)
		{
			switch (sexo)
			{
				case (1):
				{
					contsexofeminino++;
					break;
				}
				case (2):
				{
					contsexomasculino++;
					break;
				}
				default: 
				{
				}
			}
		}
		
		switch (triagem)
		{
			case (1):
			{
				conttriagemcovid++;
				break;
			}
			case (2):
			{
				conttriagemdengue++;
				break;
			}
			case (3):
			{
				conttriagemgripecomum++;
				break;
			}
			default: 
			{
			}
		}
		
		if (idade>70 && triagem==1)
		{
			qnta70anoscovid++;		
		}
		else
		{
		}
		printf("\nTriagem FINALIZADA");
		printf("\n========================================================================================================");
	}
	
	qntatendidospediatria = contsexofeminino + contsexomasculino;
	
	mediaatendimentoscovid = ((float)conttriagemcovid / atendimentos) * 100;
	
	printf("\n\n\n");
	
	printf("RESULTADOS ESTATISTICOS:");
	
	printf("\n========================================================================================================");
	printf("\nAtendimentos pediatria TOTAL:[%d] (Total Pacientes Masculinos + Total Pacientes Femininos com Idade < 18)",qntatendidospediatria);
	printf("\n========================================================================================================");
	printf("\nAtedimentos aos quais o paciente tinha COVID e com Idade > 70:[%d]",qnta70anoscovid);
	printf("\n========================================================================================================");
	printf("\nMEDIA Atendimentos COVID:[%0.2f]%%",mediaatendimentoscovid);
	printf("\n========================================================================================================\n");
	
	if (conttriagemcovid==conttriagemdengue && conttriagemgripecomum==conttriagemdengue)
	{
		printf("COVID, DENGUE e GRIPE COMUM Tiveram a mesma quantidade de atendimentos");
	}
	if (conttriagemcovid==conttriagemdengue && conttriagemcovid>conttriagemgripecomum)
	{
		printf("COVID e DENGUE Tiveram a mesma quantidade de atendimentos, e ocorram mais vezes");
	}
	if (conttriagemdengue==conttriagemgripecomum && conttriagemdengue>conttriagemcovid)
	{
		printf("DENGUE e GRIPE COMUM Tiveram a mesma quantidade de atendimentos, e ocorram mais vezes");
	}
	if (conttriagemcovid==conttriagemgripecomum && conttriagemcovid>conttriagemdengue)
	{
		printf("COVID e GRIPE COMUM Tiveram a mesma quantidade de atendimentos, e ocorram mais vezes");
	}
	
	
	if (conttriagemcovid>conttriagemdengue && conttriagemcovid>conttriagemgripecomum)
	{
		printf("COVID ocorreu mais vezes");
	}
	if (conttriagemdengue>conttriagemcovid && conttriagemdengue>conttriagemgripecomum)
	{
		printf("DENGUE ocorreu mais vezes");
	}
	if (conttriagemgripecomum>conttriagemcovid && conttriagemgripecomum>conttriagemdengue)
	{
		printf("GRIPE COMUM ocorreu mais vezes");
	}
}


