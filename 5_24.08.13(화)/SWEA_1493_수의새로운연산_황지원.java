package sw.D3;

import java.util.Scanner;

public class no1493_수의새로운연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int ans = 0;
			int p = sc.nextInt();
			int q = sc.nextInt();
			
			// p의 좌표 + q의 좌표 -> 값
			int x = 1;
			int y = 1;
			int count = 1;
			int num = 1;
			while(num < p) {
				++x;
				--y;
				if(y == 0) {
					x = 1;
					++count;
					y += count;
					++num;
				} else ++num;
			}
			int px = x;
			int py = y;
			
			
			x = 1;
			y = 1;
			count = 1;
			num = 1;
			while(num < q) {
				++x;
				--y;
				if(y == 0) {
					x = 1;
					++count;
					y += count;
					++num;
				} else ++num;
			}
			int qx = x;
			int qy = y;
			
			
			x = 1;
			y = 1;
			count = 1;
			num = 1;
			while(x != (px+qx) || y != (py+qy)) {
				++x;
				--y;
				if(y == 0) {
					x = 1;
					++count;
					y += count;
					++num;
				} else ++num;
			}
			ans = num;
			
			System.out.println("#"+t+" "+ans);
		}
	}
}
