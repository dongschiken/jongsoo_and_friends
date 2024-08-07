package com.ssafy.study.swea._3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class ProblemTitle_SWEA_7087_문제제목붙이기_이동영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			char[] ch = new char[N];
			// 맨 앞자리 알파벳만 가져와서 캐릭터 배열 담고, Set 자료구조에도 담는다. ( 중복제거 )
			for (int j = 0; j < ch.length; j++) {
				ch[j] = br.readLine().charAt(0);
				set.add(ch[j]);
			}
			// Set을 반복하면서 다시 리스트에 담는다. 
			List<Character> list = new ArrayList<>();
			Iterator ir = set.iterator();
			while (ir.hasNext()) {
				char c = (char) ir.next();
				list.add(c);
			}
			char a = 'A';
			int count = 0;
			// 2중 loop를 통해 a와 리스트의 모든 알파벳을 비교하면서 찾으면 count++해주고, A를 +1 해서 B로 만든다.
			// 그리고 리스트에서 그 부분을 삭제한다. ( 내림차순 정렬해서 풀었으면 더 간단하게 풀었을것 같다. )
			for (int j = 0; j < 26; j++) {
				for (int j2 = 0; j2 < list.size(); j2++) {
					if(list.get(j2) == a) {
						list.remove(j2);
						count++;
						a++;
					}
				}
			}
			bw.write("#"+i+" "+count+"\n");
			set.clear();
			list.clear();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
