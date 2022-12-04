#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct student 
{
	char name[20];
	int age;
};

typedef struct student std;

int main()
{
	
	std std1 = {.name = "Aman Kumar", .age = 19};
	
	char *buffer = (char*) (malloc(sizeof(std)));
	int i;
	
	memcpy(buffer, &std1, sizeof(std));
	
	printf("copied byte array : ");
	for(i = 0; i < sizeof(std); i++) 
		printf("%02X ", buffer[i]);
	printf("\n");
	free(buffer);
	
	return 0;
}
