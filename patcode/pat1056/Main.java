/*给定 N 个非 0 的个位数字，用其中任意 2 个数字都可以组合成 1 个 2 位的数字。要求所有可能组合出来的 2 位数字的和。例如给定 2、5、8，则可以组合出：25、28、52、58、82、85，它们的和为330。

输入格式：
输入在一行中先给出 N（1 < N < 10），随后给出 N 个不同的非 0 个位数字。数字间以空格分隔。

输出格式：
输出所有可能组合出来的2位数字的和。

输入样例：
3 2 8 5

      
    
输出样例：
330
*/
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		for(int i=0;i<n;i++){
			int temp = s.nextInt();
			sum+=temp*10+temp;
		}
		s.close();
		System.out.println(sum*(n-1));
	}
}
