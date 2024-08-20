import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(); 
		int[][] condition = new int[6][2];
		
		for(int i = 0; i < 6; i++) {
				condition[i][0] = sc.nextInt(); 
				condition[i][1] = sc.nextInt(); 
		}
		int bigW = 0;
		int bigWIdx = 0;
		int bigH = 0;
		int bigHIdx = 0;
		
		for(int i = 0; i < 6; i++) {
			if(condition[i][0] == 1 || condition[i][0] == 2) {
				if(condition[i][1] > bigW) {
					bigW = condition[i][1];
					bigWIdx = i;
				}
			}
			else if(condition[i][0] == 3 || condition[i][0] == 4) {
				if(condition[i][1] > bigH) {
					bigH = condition[i][1];
					bigHIdx = i;
				}
			}
		}
		
		int smallW = condition[(bigWIdx + 3) % 6][1];
		int smallH = condition[(bigHIdx + 3) % 6][1];
		
		
		int square = ((bigW * bigH) - (smallW * smallH));
		System.out.println(square * K);
		
	}
}
