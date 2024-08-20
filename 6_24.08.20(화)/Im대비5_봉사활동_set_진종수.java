
	import java.util.*;

	public class  Im대비5_봉사활동_set_진종수 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt(), t = 0;  // 테스트 케이스 수

	        while (t++ < T) {
	            int N = sc.nextInt();  // 학생 수
	            int min = sc.nextInt(); // 최소 인원
	            int max = sc.nextInt(); // 최대 인원

	            // 학생들의 점수 배열 입력받기
	            int[] students = new int[N];
	            for (int i = 0; i < N; i++) {
	                students[i] = sc.nextInt();
	            }

	            // Set을 사용하여 중복 점수를 제거하고, 이를 List로 변환 후 정렬
	            Set<Integer> uniqueScores = new HashSet<>();
	            for (int score : students) {
	                uniqueScores.add(score);
	            }
	            // 중복 제거된 점수들 리스트에 정렬. 
	            List<Integer> sortedScores = new ArrayList<>(uniqueScores);
	            Collections.sort(sortedScores);

	            int ans = Integer.MAX_VALUE;

	            // 가능한 score1과 score2 조합을 설정
	            for (int i = 0; i < sortedScores.size() - 2; i++) {
	                int score1 = sortedScores.get(i);

	                for (int j = i + 1; j < sortedScores.size() - 1; j++) {
	                    int score2 = sortedScores.get(j);

	                    // 각 분반의 학생 수 계산
	                    int sum1 = 0, sum2 = 0, sum3 = 0;
	                    for (int score : students) {
	                        if (score < score1) {
	                            sum1++;
	                        } else if (score < score2) {
	                            sum2++;
	                        } else {
	                            sum3++;
	                        }
	                    }

	                    // 각 분반이 최소 인원 이상이고 최대 인원 이하인지 확인
	                    if (sum1 >= min && sum1 <= max && sum2 >= min && sum2 <= max && sum3 >= min && sum3 <= max) {
	                        // 가장 많은 학생 수와 가장 적은 학생 수의 차이를 계산
	                        int maxGroup = Math.max(sum1, Math.max(sum2, sum3));
	                        int minGroup = Math.min(sum1, Math.min(sum2, sum3));
	                        ans = Math.min(ans, maxGroup - minGroup);
	                    }
	                }
	            }

	            // 결과 출력
	            System.out.printf("#%d %d%n", t, ans == Integer.MAX_VALUE ? -1 : ans);
	        }

	        sc.close(); // Scanner 닫기
	    }
	}