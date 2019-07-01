#include <stdio.h> 
// A normal function with an int parameter 
// and void return type 
void add(int a,int b) 
{ 
	printf("a+b=", a+b); 
}
void sub(int a,int b) 
{ 
	printf("a-b=", a-b); 
}
void mul(int a,int b) 
{ 
	printf("a*b=", a*b); 
}
void div(int a,int b) 
{ 
	printf("a/b=", a/b); 
} 

int main() 
{ 
	// fun_ptr is a pointer to function fun() 
	void (*fun[])(int) = {add,sub,mul,div}; 
	scanf("%d",&x);
	scanf("%d",&y);
	scanf("%d",&z);
	(*fun[c])(a,b); 
	return 0; 
} 
