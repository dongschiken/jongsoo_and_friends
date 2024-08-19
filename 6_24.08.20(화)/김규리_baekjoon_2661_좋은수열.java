package baekjoonGold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//최솟값 구하는 것 때문에 list를 만들었었는데, 그냥 만족하는 가장 작은 수 찾으면 돼서 찾으면 바로 종료하면 됨 

public class Main2661_좋은수열 {
	static List<String> candidates;
	static String[] nums = { "1", "2", "3" };
	static int N, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		candidates = new ArrayList<>();

		String st = "";
		addString(st);

		
		//숫자 길이가 80까지 길어질 수 있어서 int로 받으면 안됨 
		for (char c : candidates.get(0).toCharArray()) {
			System.out.print(Character.getNumericValue(c));
		}

	}

	private static void addString(String st) {
		
		//길이가 꽉 차거나 만족하는게 하나 생기면 탈출 
		if (st.length() == N || candidates.size() != 0) {
			candidates.add(st);
			return;
		} else if (st.length() == 0) { //아직 아무 숫자도 없으면 초기값 설정
			for (int i = 0; i < 3; i++) {
				addString(nums[i]);
			}
		} else if (!check(st)) { //조건 만족 못하면 탈출
			return;
		} else { //하나씩 붙여가면서 조건 확인하기
			for (int i = 0; i < 3; i++) {
				st += nums[i];
				if (check(st)) {
					addString(st);
				}
				st = st.substring(0, st.length() - 1);

			}
		}

	}

	private static boolean check(String st) {
		//새로 붙인 애를 포함했을 때 중복되는거 생기는지 확인
		for (int i = 1; i < st.length() / 2 + 1; i++) {
			if (st.length() >= i * 2) {
				String sub1 = st.substring(st.length() - i, st.length());
				String sub2 = st.substring(st.length() - i * 2, st.length() - i);
				if (sub1.equals(sub2)) {
					return false;
				}
			}

		}

		return true;
	}

}
