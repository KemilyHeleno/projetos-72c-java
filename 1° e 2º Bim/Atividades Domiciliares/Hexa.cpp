#include <stdio.h>//hexa.cpp
#include <stdlib.h>
int main(int q, char *t[])
{ 
struct hexa{
	unsigned  char h1:4;  //4 bits 0000 
	unsigned char h2:4;  // 4 bits 0000
                    //           1001 0001=128+16+1=145
                   //              h2     h1
                //hexa        9         1<enter>
                // t[0]        t[1]   t[2]
}valor;
             valor.h1=atoi(t[2]);             valor.h2=atoi(t[1]);
            printf("\n valor decimal=%i",valor);//imprime 145
	printf("\n valor hexa=%x",valor);//imprime 91
	printf("\n valor octal=%o",valor);//imprime 221
	return 0;
}
