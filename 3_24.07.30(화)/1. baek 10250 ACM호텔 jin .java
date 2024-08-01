import java.util.Scanner;

public class baek_10250 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {

			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int wcount = 1;
			int hcount = 1;
			int answer = 0;

			if (n > h) {
				hcount = n % h;
				if (hcount == 0) {
					hcount = h;
				}

			} else if (n == h) {
				hcount = n;
			} else if (n < h) {
				hcount = n;
			}
			if (hcount != h)
				wcount = (int) n / h + 1;
			else
				wcount = (int) n / h;
			answer = hcount * 100 + wcount;

			System.out.println(answer);
		}
	}

}
