import java.util.Scanner;

public class Solution {
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
	
			for(int i =0; i<arr.length;i++) {
				if(arr[i]!=0 && count<i) {
					add +=i-count; 
					count=i;
				}
				count+=arr[i];
			}
			
			System.out.printf("#%d %d\n",tc,add);
			tc++;
		}
	}

}
