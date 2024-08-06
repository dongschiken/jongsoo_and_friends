import java.util.Scanner;
public class baek_2564_경비원 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt(); // 가로크기 (열)
        int h = sc.nextInt(); // 세로크기 (행)
        int count = sc.nextInt(); // 상점의 개수
        int value = 0;
        int totalDistance = 0; // 전체 거리 누적 변수

        int[] directionArr = new int[count];
        int[] distanceArr = new int[count];

        for (int i = 0; i < count; i++) {
            int direction = sc.nextInt(); // 북 남 서 동
            int distance = sc.nextInt(); //
            directionArr[i] = direction;
            distanceArr[i] = distance;
        }
        int dongDirection = sc.nextInt();
        int dongDistance = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int shopDirection = directionArr[i];
            int shopDistance = distanceArr[i];

            if (dongDirection == 1) { // 동근이가 북쪽에 있을 때
                if (shopDirection == 1) { // 상점이 북쪽에 있을 때
                    value = Math.abs(dongDistance - shopDistance);
                } else if (shopDirection == 2) { // 상점이 남쪽에 있을 때
                    int minDist = Math.min(dongDistance + h + shopDistance, (w - dongDistance) + h + (w - shopDistance));
                    value = minDist;
                } else if (shopDirection == 3) { // 상점이 서쪽에 있을 때
                    value = dongDistance + shopDistance;
                } else if (shopDirection == 4) { // 상점이 동쪽에 있을 때
                    value = (w - dongDistance) + shopDistance;
                }
            } else if (dongDirection == 2) { // 동근이가 남쪽에 있을 때
                if (shopDirection == 1) { // 상점이 북쪽에 있을 때
                    int minDist = Math.min(dongDistance + h + shopDistance, (w - dongDistance) + h + (w - shopDistance));
                    value = minDist;
                } else if (shopDirection == 2) { // 상점이 남쪽에 있을 때
                    value = Math.abs(dongDistance - shopDistance);
                } else if (shopDirection == 3) { // 상점이 서쪽에 있을 때
                    value = dongDistance + (h - shopDistance);
                } else if (shopDirection == 4) { // 상점이 동쪽에 있을 때
                    value = (w - dongDistance) + (h - shopDistance);
                }
            } else if (dongDirection == 3) { // 동근이가 서쪽에 있을 때
                if (shopDirection == 1) { // 상점이 북쪽에 있을 때
                    value = dongDistance + shopDistance;
                } else if (shopDirection == 2) { // 상점이 남쪽에 있을 때
                    value = (h - dongDistance) + shopDistance;
                } else if (shopDirection == 3) { // 상점이 서쪽에 있을 때
                    value = Math.abs(dongDistance - shopDistance);
                } else if (shopDirection == 4) { // 상점이 동쪽에 있을 때
                    int minDist = Math.min(dongDistance + w + shopDistance, (h - dongDistance) + w + (h - shopDistance));
                    value = minDist;
                }
            } else if (dongDirection == 4) { // 동근이가 동쪽에 있을 때
                if (shopDirection == 1) { // 상점이 북쪽에 있을 때
                    value = dongDistance + (w - shopDistance);
                } else if (shopDirection == 2) { // 상점이 남쪽에 있을 때
                    value = (h - dongDistance) + (w - shopDistance);
                } else if (shopDirection == 3) { // 상점이 서쪽에 있을 때
                    int minDist = Math.min(dongDistance + w + shopDistance, (h - dongDistance) + w + (h - shopDistance));
                    value = minDist;
                } else if (shopDirection == 4) { // 상점이 동쪽에 있을 때
                    value = Math.abs(dongDistance - shopDistance);
                }
            }

            totalDistance += value;
        }

        System.out.println(totalDistance);
        sc.close();
    }
}
