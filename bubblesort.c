// Bubble Sort Algorithm

#include<stdio.h>

int main()
{
     int A[] = {3,4,5,2,1};
     int i, k, temp;

     for(k = 1; k < 5; k++)
     {
        for(i = 0; i < 4; i++)
        {
            if(A[i] > A[i+1])
            {
                temp = A[i];
                A[i] = A[i+1];   
                A[i+1] = temp;         
            }
        }
     }
     
     for(i = 0; i < 5; i++)
     {
        printf("%d ", A[i]);
     }
     printf("\n");

     return 0;
}
