// pat1056.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n, a[10] = {0}, num = 0;
	scanf("%d", &n); 
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &a[i]);
		num = num + a[i] * (n - 1) * 11;
	}
	printf("%d", num);
	return 0;
}

