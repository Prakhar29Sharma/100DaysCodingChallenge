/* Caesar Cipher */
/*
In Cryptography Caesar Cipher is one of the simplest and most widely known encryption technique.
in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.
*/

#include<bits/stdc++.h>
using namespace std;

string shift(string s, int k)
{
	string s2;
	for(char c : s){
		int val = c - 'a';
		val = (val + k)%26;
		char c2 = 'a' + val;
		s2 += c2;
	}
	return s2;
}

int main(){
	cout << shift("zebra", 3) << endl;
	cout << shift(shift("zebra", 3), 4) << endl;
	return 0;
}