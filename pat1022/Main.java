
//104页
import java.io.*;
import java.util.ArrayDeque;

class Main {

	public static void tenForD(int num, int D) {
		ArrayDeque<Integer> dlist = new ArrayDeque<Integer>();
		while (num != 0) {
			dlist.push(num % D);
			num = num / D;
		}
		while (!dlist.isEmpty()) {
			System.out.print(dlist.pop());
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int ten = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
		if (ten == 0) {
			System.out.println("0");
		} else {
			tenForD(ten, Integer.parseInt(num[2]));
		}
	}
}
