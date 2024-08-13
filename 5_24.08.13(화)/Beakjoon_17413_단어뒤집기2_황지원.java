package beak;

import java.util.Scanner;
import java.util.Stack;

public class no17413_단어뒤집기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String str = sc.nextLine();
		
		// < 을 만나면      : stack이 빌때까지 출력한다.
		//                : >을 만날때까지 프린트한다.
		// " "을 만나면     : stack 이 빌때까지 출력한다.
		// 일반문자를 만나면  : 하나씩 stack 에 담는다.
		
		int i = 0;
		while(i < str.length()) {
			if(str.charAt(i) == '<') {
				while(stack.size() != 0) {
					System.out.print(stack.pop());
				}
				System.out.print("<");
				while(str.charAt(++i) != '>') {
					System.out.print(str.charAt(i));
				}
				System.out.print('>');
				i++;
				
			} else if(str.charAt(i) == ' ') {
				while(stack.size() != 0) {
					System.out.print(stack.pop());
				}
				i++;
				System.out.print(" ");
				
			} else { 
				stack.add(str.charAt(i));
				i++;
			}
		}
		while(stack.size() != 0) {
			System.out.print(stack.pop());
		}
	}
}
