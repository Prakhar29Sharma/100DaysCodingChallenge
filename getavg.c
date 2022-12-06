#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i, n;
	int total = 0;
	float average = 0.0;
	
	printf("How many numbers do you want to average?\n");
	scanf("%d", &n);
	
	int *array = (int *) malloc(n * sizeof(int));
	
	printf("Enter the values : \n");
	
	for(i = 0; i < n; i++) {
		scanf(" %d", &array[i]);
		total += array[i];
	}
	
	average = (float)total/(float)n;
	
	printf("average is %.2f\n", average);
	
	return 0;
}
