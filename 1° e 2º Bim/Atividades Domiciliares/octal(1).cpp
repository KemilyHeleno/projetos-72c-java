#include <stdio.h>//octal.cpp
#include <stdlib.h>
int main(int q, char *t[])
{
struct octal{
	unsigned  char o1:3;  //3 bits 000
	unsigned char o2:3;  // 3 bits 000
	unsigned char o3:2;  // 2 bits 00
	                    //         10   010   001
                                  //          o3    o2     o1
                     //octal               2      2       1<enter>
                     // t[0]             t[1]  t[2]  t[3]
}valor;
valor.o1=atoi(t[3]);   valor.o2=atoi(t[2]);      valor.o3=atoi(t[1]);
            printf("\n valor decimal=%i",valor);//imprime 145
	printf("\n valor hexa=%x",valor);//imprime 91
	printf("\n valor octal=%o",valor);//imprime 221

	return 0;
}
