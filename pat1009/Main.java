import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		br.close();
		for(int i=list.length-1;i>=0;i--){
			System.out.print(list[i]);
			if(i!=0)System.out.print(" ");
		}
	}
}
