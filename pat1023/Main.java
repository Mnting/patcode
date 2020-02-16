import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");
        int t = 0,i=0,j=0,m=0;
        for(i=1;i<10;i++){
            if(Integer.parseInt(list[i])!=0){
                System.out.print(i);
                t=i;
                break;
            }
        }
        for(j=0;j<t;j++){
            for(m=0;m<Integer.parseInt(list[j]);m++)
                System.out.print(j);
        }
        for(i=1;i<Integer.parseInt(list[t]);i++)System.out.print(t);
        for(j=t+1;j<10;j++)for(m=0;m<Integer.parseInt(list[j]);m++)System.out.print(j);
        }
    }
