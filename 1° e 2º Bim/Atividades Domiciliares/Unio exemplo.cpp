#include <stdio.h>
#include <stdlib.h>
union tipoU{
	                    //                x
	short int x;        //16 bits  00000000 00000000 
	unsigned char c[2]; //16 bits  00000000 00000000
	                    //           c[1]    c[0]
}v; //variavel v
int main(int q, char *t[])
{
	/*
	porque usar uma union?????
	1)economia de memoria
	se os seus campos não sao usados ao mesmo tempo
	nao tem sentido reservar espaço para dois
	2)manipulacao de bits
	permite fazer acessos controlados a nivel de bits
	nas variaveis
	*/
	//1 exemplo de uso bem simples
	v.x = 1545;//binario 0000 0110 0000 1001
	                                 //       0      6     0       9  hexa
	printf("\n x=%i",v.x);//imprime x=1545
	printf("\n c[0]=%i",v.c[0]);//imprime c[0]=9
	printf("\n c[1]=%i",v.c[1]);//imprime c[1]=6
	
	//2 exemplo fazer a mesma coisa sem union, fica um pouco diferente
	short int x = 1545; //binario 0000 0110 0000 1001
	short int y = 0;
	unsigned char c0;//  binario 0000 0000
	unsigned char c1;//  binario 0000 0000
	
	y = x & 0x00ff;//operacão de AND a nivel de bits
	//operacao a nivel de bits
    //lembrando que x=1545 em decimal    
	//0000 0110 0000 1001 ->valor de x binario (1545 decimal)
	//0000 0000 1111 1111 ->valor binario (0x00ff hexadecimal)
	
	//faz um AND binario ((&) 1&0=0 1&1=1 0&0=0 0&1=0)
	//0000 0000 0000 1001 ->RESULTADO EM y
	
	
	c0=y; //guarda y em c0;
	//c0 = 0000 1001 = 9 decimal 
	//c0 possui 8 bits perde o resto
	
	// rotacao de bits para direita na variavel y
	y=x;
	//y=0000 0110 0000 1001 original (1545 decimal)
	y = y >> 1; //faz uma rotação de 1 bits para direita
	//onde entra bit 0 pela esquerda e sai bit pela direita
	//y=0 000 0011 0000 0100
	y = y >> 1; //faz uma rotação de 1 bits para direita
	//y=0 000 0001 1000 0010
	y = y >> 1; //faz uma rotação de 1 bits para direita
	//y=0 000 0000 1100 0001
	y = y >> 1; //faz uma rotação de 1 bits para direita
	//y=0 000 0000 0110 0000
	
	y = y >> 4; //faz uma rotação de 4 bits para direita
	//x=0000 0000 0000 0110
	//fiz 8 rotacoes de bits
	
	//x=1545 lembrando
	//0000 0110 0000 1001-valor de x sem rotacao 
	//0000 0000 0000 0110-valor de y com rotacao de 8 bits
	
	c1=y;
	//c1= 0000 0110 = 6 decimal
	//c1 possui 8 bits perde o resto
	printf("\n x=%i",x);//imprime 1545	printf("\n c0=%i",c0);//imprime 9	printf("\n c1=%i",c1);//imprime 6
	return 0;
}
