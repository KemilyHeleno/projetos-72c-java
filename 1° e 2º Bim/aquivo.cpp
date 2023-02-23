//tabuada.cpp
//tabuada  <enter>
#include<stdio.h>
#include<windows.h>
main(int q, char* t[])
{
	FILE* arquivo =fopen(t[1],"r");
	if (arquivo==NULL)
	{
		printf("\nArquivo não existe! %s",t[1]);
		return 0;
	}
	int contagem = 0;
	char caractere;
	do
	{
		caractere = fgetc(arquivo);
		printf("%c",caractere);
		getchar();
		if(caractere == '\n')
		{
			contagem++;
		}
	}while(caractere !=EOF);
	printf("O arquivo possui %d linhas. \n",contagem);
	fclose(arquivo);
	return 0;
	
}
