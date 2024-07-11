/*esse
e um comentário em bloco
*/
//esse é um comentário em linha
/*
Esse programa pergunta ao usuário o seu salário e departamento, utiliza como entrada e mostra como saída o salário e o departamento informados
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
