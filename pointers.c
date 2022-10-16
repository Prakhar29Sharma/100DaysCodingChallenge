#include<stdio.h>

int main()
{
    int n;
    n = 10;
    // ptr is pointer to variable n
    int* ptr = NULL;
    ptr = &n;
    printf("address of n : %p\n", ptr);
    printf("value in n : %d\n", *ptr);
    // newptr is pointer to ptr pointer
    int** newptr = NULL;
    newptr = &ptr;
    printf("adress of ptr : %p\n", newptr);
    printf("value of ptr : %p\n", *newptr);
    printf("value of n : %d\n", **newptr);
    **newptr = 5;
    printf("updated value of n : %d\n", **newptr);
    return 0;
}
