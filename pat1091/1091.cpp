#include <iostream>
#include <string>
using namespace std;
int main()
{
	int m;
	cin >> m;
	for (int i = 0; i < m; i++)
	{
		int k;
		cin >> k;
		int flag = 0;
		for (int j = 1; j < 10; j++)
		{
			int num = j * k * k;
			string num1 = to_string(num), sk = to_string(k);
			string num2 = num1.substr(num1.length() - sk.length());
			
			if (num2 == sk)
			{
				printf("%d %d\n", j, num);
				flag=1;
				break;
			}
		}
		if(flag==0) printf("No\n");
	}
	return 0;
}
