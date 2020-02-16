import java.io.*;
import java.util.Arrays;
	final
class Main{
	public  static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[1]);
		int b = Integer.parseInt(s[3]);
		int aa=0,bb=0;
		for (int i =0;i<s[0].length();i++) {
			if(s[1].equals(s[0].substring(i,i+1)))
				aa=aa*10+a;
		}
		for (int j = 0; j < s[2].length(); j++) {
			if (s[3].equals(s[2].substring(j,j+1)))
				bb = bb * 10 + b;
		}
		System.out.println(aa+bb);
	}
}
