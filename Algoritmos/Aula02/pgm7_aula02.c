/*esse
e um coment�rio em bloco
*/
//esse � um coment�rio em linha
/*
Esse programa pergunta ao usu�rio o seu sal�rio e departamento, utiliza como entrada e mostra como sa�da o sal�rio e o departamento informados
*/

#include <stdio.h>
int main(void)
{
	double salario;
	int departamento;
	
	printf("informe o seu salario\n");
	scanf("%lf",&salario);
	
	printf("informe o seu departamento\n");
	scanf("%d",&departamento);
	
	printf("seu salario e de: %lf reais ",salario);
	printf("\nseu departamento e de: departamento %d",departamento);
}
