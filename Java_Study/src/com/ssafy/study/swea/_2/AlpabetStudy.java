package com.ssafy.study.swea._2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class AlpabetStudy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		char[] alpa = new char[26];
		for (int i = 0; i < alpa.length; i++) {
			alpa[i] = (char) ('a'+i);
		}
		for (int i = 0; i < T; i++) {
			int max = Integer.MIN_VALUE;
			int count = 0;
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if(alpa[j] == str.charAt(j)) {
					count++;
				}else {
					break;
				}
			}
			max = Math.max(max, count);
			bw.write("#"+(i+1)+" "+max+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
