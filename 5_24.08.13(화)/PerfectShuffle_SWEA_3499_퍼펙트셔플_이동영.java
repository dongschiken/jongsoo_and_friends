package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectShuffle_SWEA_3499_퍼펙트셔플_이동영 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			//  5가나오면 3으로 만들고, 7이나오면 4로 만든다.
			int half = N - N/2;
			String[] str = br.readLine().split(" ");

			// 5가 나왔을 경우 K는 0->1->2 순으로 증가 / half는 3-4 순으로 증가
			for (int j = 0, k = 0; j < str.length; j++) {
				if(j % 2 == 0) {
					sb.append(str[k++]).append(" ");
				}else {
					sb.append(str[half++]).append(" ");
				}
			}
			System.out.println("#"+i+" "+sb);
			sb.delete(0, sb.length());
		}
		
	}

}
