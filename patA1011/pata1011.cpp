#include <cstdio>
using namespace std;
int main()
{
	float num[3];
	float temp = 0.0;
	int flag[3];
	char s[4] = {"WTL"};
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			scanf("%f", &num[i]);
			//printf("%.2f \n",num[i]);
			if (j == 0)
			{
				flag[i] = j;
				temp = num[i];
			}
			else
			{
				if (num[i] < temp)
				{
					num[i] = temp;
				}
				else
				{
					temp = num[i];
					flag[i] = j;
				}
			}
		}

		//printf("%d %.2f %.2f \n",flag[i],num[i],temp);
		temp = 0;
	}
	float sum = (num[0] * num[1] * num[2] * 0.65 - 1) * 2;
	printf("%c %c %c %.2f", s[flag[0]], s[flag[1]], s[flag[2]], sum);
	return 0;
}
