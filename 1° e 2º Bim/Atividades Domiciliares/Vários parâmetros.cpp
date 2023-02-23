#include <stdio.h>// prog1.cpp   c:>prog1 310 20 cti  bauru <enter>
#include <stdlib.h>
main(int qtd, char *txt[])
{
   printf("\n qtde=%d",qtd);
   getchar();
   for(int j=0;j<qtd;j++)
   {  
      printf("\n txt[%d]=%s",j,txt[j]);
      getchar();
    }///for
}

//vários parâmetros para dentro do programa
