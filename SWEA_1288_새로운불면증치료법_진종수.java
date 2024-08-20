import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_1288_새로운불면증치료법_진종수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int check=0, cnt=0;
			while(check !=(1<<10)-1) {
				int s= (++cnt)*n;
				while(s>0) {
				check|=1<<(s%10);
				s/=10;
				}
			}
			System.out.println("#"+tc+" "+(cnt*n));
		}
	}

}
