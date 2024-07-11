#include <stdio.h>
int main (void)
{
	int a, b;
	int cont1,cont2;
	int somanupares = 0;
	int somanuimpares = 0;

	printf("Insira A:\n");
	scanf("%d",&a);
	
	printf("Insira B:\n");
	scanf("%d",&b);	
	
	for(cont1=0;cont1<a;cont1++)
	{
		if(cont1 % 2 == 0)
		{
			somanupares = somanupares + cont1;
		}
	}
	
	
	
	if(a<b)
	{
		for(cont2=0;cont2<=b;cont2++)
		{
			if(cont2>=a)
			{
				if(cont2 % 2 != 0)
				{
					somanuimpares = somanuimpares +  cont2;
					printf("%d\n",cont2);
				}
			}
		}
	}
	
	printf("\nSOMA PARES:[%d]",somanupares);
	printf("\nSOMA IMPARES:[%d]",somanuimpares);
}

