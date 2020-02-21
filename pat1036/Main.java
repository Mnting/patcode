import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		br.close();
		int col = Integer.parseInt(list[0]);
		int row = 0;
		if (col % 2 == 0) {
			row = col - 1;
		} else {
			row = col;
		}
		for (int i = 1; i <= row; i++) {
			if (i == 1 || i == row) {
				for (int n = 1; n <= col; n++)
					System.out.print(list[1]);
				System.out.println();
			} else if (i % 2 == 1) {
				for (int j = 1; j <= col; j++) {
					if (j == 1 || j == col) {
						System.out.print(list[1]);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
