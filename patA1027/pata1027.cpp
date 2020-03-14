#include <cstdio>
using namespace std;
int main()
{
	int num = 0;
	printf("#");
	char s[14] = {"0123456789ABC"};
	for (int i = 0; i < 3; i++)
	{
		scanf("%d", &num);
		int x = num / 13;
		int y = num % 13;
		printf("%c%c", s[x], s[y]);
	}
	return 0;
}
