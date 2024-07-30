package com.ssafy.study.baekjoon_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ColorPaper01 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("data/ColorPaper01.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int count = 0;
		int[][] paper = new int[101][101];
		for (int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for (int j = r; j < r+10; j++) {
				for (int j2 = c; j2 < c+10; j2++) {
					paper[j][j2] = 1;
				}
			}
		}
		for (int j = 0; j < 101; j++) {
			for (int j2 = 0; j2 < 101; j2++) {
				if(paper[j][j2] == 1) {
					count++;
				}
			}
			
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
		
		
	}

}
