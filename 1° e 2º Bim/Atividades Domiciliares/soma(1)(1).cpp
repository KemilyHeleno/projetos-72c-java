#include <stdio.h>////soma.cpp      c:>soma 10 29<enter>
#include <stdlib.h>
main(int qtd, char *txt[])
{
   int valor1,valor2,valor3;
   if(qtd!=3)
   {
     printf("\n erro de sintaxe: execute soma valor1 valor2<enter>");
     return 0;
   }     
    valor1=atoi(txt[1]);////array to int
    valor2=atoi(txt[2]);
    valor3=valor1+valor2;
    printf("\n soma> %d + %d = %d",valor1,valor2,valor3);   
}
