#include<stdio.h>
// std = standard (padrão)
// io = input output (entrada e saída)
//.h = header
main(int q, char *txt[])
{
	printf("Argumentos externos");
	printf("\n qtd= %d",q);
	printf("\n txt[0] = %s", txt[0]);
	printf("\n txt[1] = %s", txt[1]);
	printf("\n txt[2] = %s", txt[2]);
}
