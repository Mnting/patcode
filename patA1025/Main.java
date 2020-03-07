import java.io.*;
import java.util.ArrayList;

class infoStudent {
	String registration_number = "";// 学号
	int score = 0;
	int final_rank = 0;// 年级排名
	int location_number = 0;// 考场号
	int local_rank = 0;// 考场排名
}

class Main {
	public static ArrayList<infoStudent> stu = new ArrayList<infoStudent>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int room = Integer.parseInt(br.readLine());

		for (int i = 0; i < room; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = 0; j < num; j++) {
				String[] input = br.readLine().split(" ");
				infoStudent infoStu = new infoStudent();
				infoStu.location_number = i + 1;
				infoStu.score = Integer.parseInt(input[1]);
				infoStu.registration_number = input[0];
				stu.add(infoStu);
			}
			location_cmp(stu.size() - num, stu.size() - 1);
		}
		cmp(0, stu.size() - 1);
		System.out.println(stu.size());
		for (infoStudent temp : stu) {
			System.out.println(temp.registration_number + " " + temp.final_rank + " " + temp.location_number + " "
					+ temp.local_rank);
		}
	}

	public static void location_cmp(int start, int end) {
		for (int m = end; m >= start; m--) {
			for (int n = end; n > start + end - m; n--) {
				if (stu.get(n - 1).score < stu.get(n).score) {
					infoStudent infoStu = new infoStudent();
					infoStu = stu.get(n - 1);
					stu.set(n - 1, stu.get(n));
					stu.set(n, infoStu);
				} else if (stu.get(n - 1).score == stu.get(n).score
						&& stu.get(n - 1).registration_number.compareTo(stu.get(n).registration_number) > 0) {
					infoStudent infoStu = new infoStudent();
					infoStu = stu.get(n - 1);
					stu.set(n - 1, stu.get(n));
					stu.set(n, infoStu);
				}
			}
			int rank = 0, index = 1;
			for (int s = start; s <= end; s++) {
				rank++;
				if (s != start && stu.get(s).score != stu.get(s - 1).score) {
					index = rank;
				}
				infoStudent infoStu = stu.get(s);
				infoStu.local_rank = index;
				stu.set(s, infoStu);
			}
		}
	}

	public static void cmp(int start, int end) {
		for (int m = end; m >= start; m--) {
			for (int n = end; n > start + end - m; n--) {
				if (stu.get(n - 1).score < stu.get(n).score) {
					infoStudent infoStu = new infoStudent();
					infoStu = stu.get(n - 1);
					stu.set(n - 1, stu.get(n));
					stu.set(n, infoStu);
				} else if (stu.get(n - 1).score == stu.get(n).score
						&& stu.get(n - 1).registration_number.compareTo(stu.get(n).registration_number) > 0) {
					infoStudent infoStu = new infoStudent();
					infoStu = stu.get(n - 1);
					stu.set(n - 1, stu.get(n));
					stu.set(n, infoStu);
				}
			}
			int rank = 0, index = 1;
			for (int s = start; s <= end; s++) {
				rank++;
				if (s != start && stu.get(s).score != stu.get(s - 1).score) {
					index = rank;
				}
				infoStudent infoStu = stu.get(s);
				infoStu.final_rank = index;
				stu.set(s, infoStu);
			}
		}
	}
}
