package sw.D3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class no4047_영준이의카드카운팅 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T;t++) {
			String[] str = sc.next().split(""); // 문자열을 char로 끊어서 배열에 저장

			// 3개씩 끊어읽기,,, 좋은 방법 없을까,,
			List<String> list = new ArrayList<>();
			String card = str[0];
			for(int i = 1; i < str.length; i++) {
				if(i % 3 == 0) {
					list.add(card);
					card = "";
				}
				card += str[i];
			}
			list.add(card);


			// 겹치는 카드 있으면 ERROR
			Set<String> set = new HashSet<>();
			for(int i = 0; i < list.size();i++) {
				set.add(list.get(i));
			}
			
			if(!(set.size() == list.size())) {
				System.out.println("#"+t+" "+ "ERROR");
				continue;
			}
			
			// 게임을 하기 위해선 몇장의 카드가 필요한가
			// 아이디어 : 중복된 카드는 없기에 무늬별(pattern)로 카운트 하고 13에서 빼준다. 
			int countS = 13;
			int countD = 13;
			int countH = 13;
			int countC = 13;
			for(int i = 0; i < list.size();i++) {
				char pattern = list.get(i).charAt(0);
				switch(pattern) {
				case 'S' : --countS; break;
				case 'D' : --countD; break;
				case 'H' : --countH; break;
				case 'C' : --countC; break;
				}
			}
			System.out.println("#"+t+" "+countS+" "+countD+" "+countH+" "+countC);
		}
	}
}
