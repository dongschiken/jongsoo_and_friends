package week_04;

import java.util.Scanner;

public class SWEA_2005_파스칼의삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int tc = 1;
		while (tc <= t) {

			int n = sc.nextInt();

			int[][] arr = new int[n][n];
			if(n==1) {
				System.out.println("#"+tc);
				System.out.println(1);}
			else if(n==2)	{
				System.out.println("#" + tc);
				System.out.println("1");
				System.out.println("1" + " "+ "1");
			}
			else if(n>2) {
			arr[0][0] = 1;
			arr[1][0] = 1;
			arr[1][1] = 1;

			for (int i = 2; i < n; i++) {
				for (int j = 0; j < i+1; j++) {
					if (i - 1 >= 0 && j - 1 >= 0)
						arr[i][j] = arr[i - 1][j-1] + arr[i-1][j];
					else
						arr[i][j] = 1;
				}
			}
			System.out.println("#"+tc);
			for(int i=0; i<n; i++) {
				for(int j=0; j<i+1; j++) {
					System.out.print(arr[i][j]+ " ");
				}System.out.println();
			}
			
		} tc++;}
	}

}
