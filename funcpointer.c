#include<stdio.h>

/*
identifier : add
right : nothing
left : pointer
right : function that takes 3 int
left : returns int*
int* (*foo) (int, int, int);
*/

typedef int (*operation_ptr) (int, int);

int add(int x, int y)
{
	return x + y;
}

int mult(int x, int y)
{
	return x * y;
}

int do_operation(operation_ptr op, int x, int y) 
{
	return op(x,y);
}

int main()
{
	int a = 5;
	int b = 6;
	printf("addition of a and b : %d\n", do_operation(add,a,b));
	printf("multiplication of a and b : %d\n",do_operation(mult,a,b));
	return 0;
}
