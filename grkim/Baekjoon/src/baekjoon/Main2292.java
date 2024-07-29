package baekjoon;

import java.util.Scanner;


public class Main2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int gap = 0; 
		int total = 1;
		int count = 0;
		
		while (N > total) {
			total += gap;
			gap += 6;
			count ++;
		}
		
		if (N == 1)
			count = 1;
		
		System.out.print(count);
		
	}

}
