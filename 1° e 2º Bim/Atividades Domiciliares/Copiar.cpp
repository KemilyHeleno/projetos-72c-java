#include<stdio.h>////copiar.cpp
#include<stdlib.h>
main(int qtd, char *txt[])
{
   char letra;
   FILE *arq1,*arq2;
   if(qtd!=3)
   {
      printf("\n sintaxe incorreta para copiar arquivo!!");
      printf("\n digite:copiar arq1 arq2<enter>");
      getchar();
      return 0;
   }
   arq1=fopen(txt[1],"r");
   if(arq1==NULL)
   {
      puts(" ESTE arquivo nao existe!!!");
      puts(txt[1]);
       return 0;
   }
   arq2=fopen(txt[2],"w");
 while(1==1)
  {
     letra=getc(arq1);//get caracter arquivo
     if(letra==EOF)break;///eof=end of file 
    putc(letra,arq2); 
    printf("%c",letra);
  }
  fclose(arq1); fclose(arq2);

   printf("\n fimmmmmm");
}

//C:> copiar arq.cpp arq2.cpp <enter>

