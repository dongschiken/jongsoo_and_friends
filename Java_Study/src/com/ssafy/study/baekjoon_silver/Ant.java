package com.ssafy.study.baekjoon_silver;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ant {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int w = sc.nextInt();
		int h = sc.nextInt();
		// �쁽�옱 �쐞移� x
		int p = sc.nextInt();
		// �쁽�옱 �쐞移� y
		int q = sc.nextInt();
		int t = sc.nextInt();
		int w2 = 2*w;
		int h2 = 2*h;
		int x = (t + p) % w2;
		int y = (t + q) % h2;
		if(x > w) {
			x = w2 - x;
		}
		
		if(y > h) {
			y = h2 - y;
		}
		sb.append(x+" "+y);
		System.out.println(sb);
	}
}