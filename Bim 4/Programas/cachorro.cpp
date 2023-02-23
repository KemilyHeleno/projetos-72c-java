#include<stdio.h>
#include<stdlib.h>
#include<string.h>>
class cachorro
{
	int tamanho; //atributos da classe
	char raca[20];
	public:
		void cria_cao()
		{
			tamanho=0;
			strcpy(raca,"");//raca[0]='/0';
		}
		//zera as variÃ¡veis da constante
		void altera_cao(char *vraca, int tam)
		{
			tamanho =tam;
			strcpy(raca, vraca);
		}
		void imprime_cao()
		{
			printf("\n cao %s de %d cm vai latir");
			latir();
		}
		void latir()
		{
			printf("\n AUAUAUAUAUAUAUAUAUAU!!!!!!!");
		}
};

main(int q, char *t[])
{
	if (q!=3)
	{
		puts("\n parametros invalidos!!!");
		return 0;
	}
	char rc[20];
	int tm=atoi(t[2]);
	
	cachorro bonito;
	bonito.cria_cao();
	bonito.altera_cao(t[1],tm);
	bonito.imprime_cao();
}
