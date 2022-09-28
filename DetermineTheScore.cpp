#include <iostream>
using namespace std;

void test()
{
    int X, N, score;
    scanf("%d %d", &X, &N);
    score = X/10;
    score = score * N;
    printf("%d\n", score);
}

int main() {
	int T;
	scanf("%d", &T);
	while(T!=0){
	    test();
	    T--;
	}
	return 0;
}

