package Day_240809;

import java.util.Scanner;

public class no1289_원재의메모리복구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int count = 0;
			char[] memory = sc.next().toCharArray(); // String -> char[] 
			
			// 0000으로 만드는데 얼마나 걸리는가?
			for(int i = 0; i < memory.length; i++) {
				if(memory[i] != '0') {
					int index = i;
					for(int j = i; j < memory.length; j++) {
						if(memory[j] == '1') memory[j] = '0';
						else memory[j] = '1';
					}
					++count;
				} 
			}
			System.out.println("#"+t+" "+count);
		}
	}
}
