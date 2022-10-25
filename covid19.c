#include <iostream>
using namespace std;

void test()
{
    int N;
    scanf("%d", &N);
    int array[N];
    for(int i = 0; i < N; i++)
    {
        scanf("%d", &array[i]);
    }
    int maxi = 1;
    int mini = 8;
    int count = 1;
    
    for(int i = 0; i < N-1; i++)
    {
        if(array[i+1]-array[i] <= 2)
        {
            count++;
        } else {
           if(count<=mini){
	           mini=count;
	       }
	       if(count>=maxi){
	           maxi=count;
	       }
	       count=1;
        }
    }
    if(mini>count){
	   mini=count;
	}
	if(maxi<count){
	   maxi=count;
	}
	
	printf("%d %d\n", mini, maxi);
}

int main() {
	// your code goes here
	int T;
	scanf("%d", &T);
	while(T != 0)
	{
	    test();
	    T--;
	}
	return 0;
}

