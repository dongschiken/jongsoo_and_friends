package week_04;

import java.util.Scanner;

public class SWEA_4789_성공적인공연기획_진종수ing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tc=1; 
		while(tc<=t) {
			String sarr = sc.next();
			int [] arr = new int[sarr.length()];
			for(int i=0; i<sarr.length(); i++) {
				arr[i]	=	sarr.charAt(i)-'0';
			}
			int count=0; // 현재 박수를 치는사람
			int add = 0; //추가해야 할 사람.
//			if(count==0) { //처음 박수 안치는경우 제거.
//				arr[0]=1;
//				add ++;
//				count ++;
//			}
			for(int i =1; i<arr.length;i++) {
				if(arr[i]!=0 && count<i) {
					add +=i-count; 
					count=add; // i로 왜 변경? 
				}
				count+=arr[i];
			}
			
			System.out.printf("#%d %d\n",tc,add);
			tc++;
		}
	}

}
