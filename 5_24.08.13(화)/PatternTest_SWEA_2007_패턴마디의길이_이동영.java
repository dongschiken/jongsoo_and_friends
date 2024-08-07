package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PatternTest_SWEA_2007_패턴마디의길이_이동영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String str = br.readLine();
			int index = 0;
			// 어차피 마디의 최대 길이가 10개까지니까
			for (int j = 1; j <= 10; j++) {
				// 0, 1 == 1, 2 비교 1개의 문자열 비교
				// 0, 2 == 2, 4 비교 2개의 문자열 비교
				// ...
				// 0, 5 == 5, 10 비교 5개의 문자열 비교 
				String tmp1 = str.substring(0, j);
				String tmp2 = str.substring(j, j*2);
				// 같은 문자열이 나왔을 경우의 길이를 index에 넣고 출력
				if(tmp2.equals(tmp1)) {
					index = j;
					break;
				}
			}
			bw.write("#"+i+" "+index+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
