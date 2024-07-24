package com.ssafy.study.baekjoon_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PaperCuting {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine());
		
		int[] row = new int[R+1];
		int[] col = new int[C+1];
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			int index = Integer.parseInt(st.nextToken());
			
			if(command == 1) {
				col[index] = 1;
			}else {
				row[index] = 1;
			}
		}
		int max = Integer.MIN_VALUE;
		bw.write(paperCheck(max, col, C)*paperCheck(max, row, R)+"");
		bw.flush();
	}

	private static int paperCheck(int max, int[] rcArr, int rc) {
		int count = 0;
		for (int i = 1; i <= rc; i++) {
			count++;
			if(rcArr[i] == 1) {
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		return max;
	}
	
}
