#include<stdio.h>
#include<stdarg.h>

int add_em_up(int count, ...)
{
	
	va_list ap;
	int i, sum;
	va_start(ap, count);       /* Initialize the arguement list*/
	sum = 0;
	for(i = 0; i < count; i++)
		sum+=va_arg(ap, int);  /* Get the next arguement value*/
		
	va_end(ap);                /* Clean up. */
	return sum;
	
}

int main()
{	
	printf("%d\n", add_em_up(3, 5, 5, 6)); // 16
	printf("%d\n", add_em_up(10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // 55
	return 0;
}
