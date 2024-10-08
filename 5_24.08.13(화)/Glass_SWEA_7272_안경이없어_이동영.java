package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Glass_SWEA_7272_안경이없어_이동영 {
	static String temp1 = "ADOPQR";
	static String temp2 = "B";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			if(containsAB(st.nextToken(), st.nextToken())) bw.write("#"+i+" SAME\n");
			else bw.write("#"+i+" DIFF\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	// str1과 str2를 각각 비교하면서 길이가 다르면 false를 리턴
	// 길이가 같으면 str1의 길이만큼 반복하면서 현재 문자에 담긴 안경의 갯수를 1, 2, 3으로 나눠서 비교
	// 두 값이 다르다면 false를 리턴
	private static boolean containsAB(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		for (int i = 0; i < str1.length(); i++) {
			int temp = 0;
			if(temp1.contains(str1.charAt(i)+"")) {
				temp = 1;
			}else if(temp2.contains(str1.charAt(i)+"")) {
				temp = 2;
			}else {
				temp = 3;
			}
			
			if(temp1.contains(str2.charAt(i)+"")) {
				temp -= 1;
			}else if(temp2.contains(str2.charAt(i)+"")) {
				temp -= 2;
			}else {
				temp -= 3;
			}
			if(temp != 0) return false;
		}
		return true;
	}

	
}
