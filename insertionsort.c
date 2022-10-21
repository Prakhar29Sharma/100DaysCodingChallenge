// Insertion Sort Algorithm

#include<stdio.h>

int main()
{
    int A[] = {3,4,5,2,1};
    int i, j;
    for(i = 1; i < 5; i++)
    {
        int value = A[i];
        int temp = i;
        while(temp > 0 && A[temp-1] > value)
        {
            A[temp] = A[temp-1];
            temp = temp - 1;
        }
        A[temp] = value;
    }

    for(i = 0; i < 5; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n");
    return 0;
}
