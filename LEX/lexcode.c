#include<stdio.h>
void main(){
	int a = 10;
	int b = 20;
	
	if(a > b){
		printf("a is greater than b\n");
	}
	else if (b > a){
		printf("b is greater than a\n");
	}
	else{
		printf("a and b are equal\n");
	}
}
/*
How to run
Step 1: Execute lex.l file
		flex lex.l
Step 2: Compile lex.yy.c
		gcc lex.yy.c -lfl
Step 3: Execute ./a.out along with lexcode.c
		./a.out<lexcode.c
*/