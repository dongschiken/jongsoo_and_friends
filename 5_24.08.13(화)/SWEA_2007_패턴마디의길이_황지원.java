package sw.D2;

import java.util.Scanner;

public class no2007_패턴마디의길이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		out : for(int t = 1; t <= T; t++) {
			int barLength = 0; // 마디길이 
			String str = sc.next(); // 문자열(길이는 30으로 고정)
			
			String tempBar = "";
			tempBar += str.charAt(0);
			for(int i = 1; i < str.length();i++) {
				char c = str.charAt(i);
				if(!(c == str.charAt(0))) {
					tempBar += c;
				} else { // 순회하다가 0번째 글자를 만남
					String newC = "";
					for(int j = i; j < (i + tempBar.length());j++) {
						newC += str.charAt(j);
					}
					// 문자가 반복되는지, 우연히 첫번째 글자를 만난건지 확인
					if(tempBar.equals(newC)) {
						System.out.println("#"+t+" "+tempBar.length());
						continue out;
					} else {
						tempBar += c;
					}
				}
			}
		}
	}
}
