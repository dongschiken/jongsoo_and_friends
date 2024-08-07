package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Crops_SWEA_2805_농작물수확하기_이동영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		// 5일때는 1 2 / 3 4 5
		// half를 2로 둔다.
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] crops = new int[N][N];
			
			for (int j = 0; j < crops.length; j++) {
				char[] ch = br.readLine().toCharArray();
				for (int j2 = 0; j2 < crops.length; j2++) {
					crops[j][j2] = (int)(ch[j2]-48);
				}
			}
			
			int left = N/2;
			int right = N/2;
			int left2 = 0;
			int right2 = N;
			int sum = 0;
			
			for (int j = 0; j < N; j++) {
				if(j < N/2) {
					for (int j2 = left; j2 <= right; j2++) {
						sum += crops[j][j2];
					}
					left--;
					right++;
				}else {
					for (int j2 = left2; j2 < right2; j2++) {
						sum += crops[j][j2];
					}
					left2++;
					right2--;
				}
			}
			bw.write("#"+(i+1)+" "+sum+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
