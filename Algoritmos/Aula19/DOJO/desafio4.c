#include <stdio.h>
#include <locale.h>
#include <stdbool.h>
#define TAM 5

int main (){
	setlocale(LC_ALL,"Portuguese");
	
	int vetor[TAM], vetorPrimo[TAM], i;
	bool ehprimo = true;
	
	for(i=0;i<TAM;i++){
		printf("Digite um número: ");
		scanf("%d",&vetor[i]);
	}
	
	for(i=0;i<TAM;i++){
		for(i=0;i<vetor[i];i++){
			if (vetor[i] % i+1 == 0){
			vetorPrimo[i]=vetor[i];
			}
		}
		
		if(ehprimo == true){
			vetorPrimo[i]=vetor[i];
		}
	}
	
	printf("Vetor primo:\n");
	
	for(i=0;i<TAM;i++){
		printf("%d; ",vetorPrimo[i]);
	}
}
