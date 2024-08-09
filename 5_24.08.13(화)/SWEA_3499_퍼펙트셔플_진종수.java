package Day07.homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_3499_퍼펙트셔플_진종수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			Queue<String> que1 = new LinkedList<>();
			Queue<String> que2 = new LinkedList<>();
			Queue<String> answerQ = new LinkedList<>();

			if (N % 2 == 1) {
				for (int i = 0; i < N / 2 + 1; i++) {
					que1.add(sc.next());
				}
				for (int i = N / 2 + 1; i < N; i++) {
					que2.add(sc.next());
				}

			} else {
				for (int i = 0; i < N / 2; i++) {
					que1.add(sc.next());
				}
				for (int i = N / 2; i < N; i++) {
					que2.add(sc.next());
				}

			}

			for (int i = 0; i < N; i++) {
				if (!que1.isEmpty()) {
					answerQ.add(que1.poll());
				}
				if (!que2.isEmpty()) {
					answerQ.add(que2.poll());
				}

			}

			System.out.print("#" + tc + " ");
			for (int j = 0; j < N; j++) {
				System.out.print(answerQ.poll() + " ");
			}
			System.out.println();

		}
	}

}
