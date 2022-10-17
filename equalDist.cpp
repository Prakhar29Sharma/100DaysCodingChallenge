#include <iostream>
using namespace std;

void test()
{
    int A, B, sum;
    scanf("%d %d", &A, &B);
    sum = A+B;
    if(sum%2==0)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
}

int main() {
	int T;
	scanf("%d", &T);
	while(T > 0) 
	{
	    test();
	    T--;
	}
	return 0;
}

