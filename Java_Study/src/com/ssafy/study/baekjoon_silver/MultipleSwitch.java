package com.ssafy.study.baekjoon_silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MultipleSwitch {

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("data/MultipleSwitch.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		String[] tempStr = br.readLine().split("");
		int[] bulb = new int[tempStr.length+1];
		
		for (int i = 1; i <= tempStr.length; i++) {
			if(tempStr[i-1].equals("Y")) {
				bulb[i] = 1;
			}else {
				bulb[i] = 0;
			}
		}
		boolean check = false;
		while (!check) {
			for (int i = 1; i < bulb.length; i++) {
				if(bulb[i] == 1) {
					int now = i;
					for (int j = i; j < bulb.length; j +=now) {
						bulb[i] = 1-bulb[i];
					}
					break;
				}
			}
			for (int i = 1; i < bulb.length; i++) {
				if(bulb[i] == 1) {
					check = false;
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
