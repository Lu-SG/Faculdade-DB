/*


*/
#include <stdio.h>
int main (void)
{
	int n1,n2, res1;
	n1=5;
	n2=7;
	/*
	printf("%d",n1++);
	printf("%d",n1);
	*/
	res1= n1++/(n2-n1);
	printf("%d",res1);	
}
