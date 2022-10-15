#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int checkPrime(long int x) 
{
    long int half = x/2;
    int i = 0;
    for(i = 1; i <= half; i++) 
    {
        if(x%i==0) 
        {
            return 0;
        }
    }
    return 1;
}

void test()
{
	long int price = 0;
    int i = 0;
    int count_odd_div, count_even_div;
    count_odd_div = 0;
    count_even_div = 0;
    scanf("%ld", &price);
    
    if(checkPrime(price) == 1)
    {
    	printf("SELL\n");
    	return;
	}
	else
	{	
		while(i != price) {
        i++;
        if(i%2==0) {
            if(price%i==0) {
                count_even_div+=1;
            }
        } else {
            if(price%i==0) {
                count_odd_div+=1;
            }
        }
    }
	}
    
    if(count_even_div == count_odd_div)
    {
        printf("PASS\n");
    }
    else if(count_even_div > count_odd_div)
    {
        printf("BUY\n");
    } 
    else if(count_even_div < count_odd_div)
    {
        printf("SELL\n");
    } 
	else
	{
    	// nothing
	}
}

int main()
{
	int T, i;
	scanf("%d", &T);
	for(i = 0; i < T; i++) 
	{
		test();
	}
	return 0;
}
