import java.io.*;
import java.util.ArrayList;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count =  Integer.parseInt(br.readLine());
		int[] num = new int[count];
		for(int i = 0;i<count;i++){
			num[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		int flag = 0;
		int[] id = new int[count];
		for(int j = 0;j<id.length;j++) id[j]=1;
		for(int m=0;m<count-1;m++){
			for(int n=m+1;n<count;n++){
				id[m]=-1;id[n]=-1;
				ArrayList<Integer> lie = new ArrayList<Integer>();
				for(int a=0;a<id.length;a++){
					if(num[a]*id[Math.abs(num[a])-1]<0) lie.add(a+1);
				}
				if(lie.size()==2&&id[lie.get(0)-1]+id[lie.get(1)-1]==0){
						System.out.print((m+1)+" "+(n+1));
					n=count;
					m = count - 1;
					flag =1;
				}
				for (int j = 0; j < id.length; j++)
					id[j] = 1;
			}
		}
		if(flag==0)System.out.print("No Solution");
	}
}
