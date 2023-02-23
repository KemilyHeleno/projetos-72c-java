//tabuada.cpp
//tabuada  <enter>
#include<stdio.h>
#include<windows.h>
main(int q, char* txt[])
{
	int v1, v2, mult;
	system("cls");
	system("color f1");
	printf("\n qtd = %d",q);
	if (q!=2)
	{
		printf("\n sintaxe errada");
		return 0;
	}
	printf("\n txt[0] = %s", txt[0]);
	printf("\n txt[1] = %s", txt[1]);
	v1=atoi(txt[1]);
	for(int i=0; i<=10; i++)
	{
		mult = i * v1;
		printf("\n %d X %d = %d", i, v1, mult);
	}
	
}
