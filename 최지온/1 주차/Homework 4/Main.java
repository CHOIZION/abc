import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 읽기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // n 값을 입력 받음
        int n = sc.nextInt();

        // 아래와 같은 패턴을 출력하기 위한 이중 루프
        // 공백 또는 별을 출력
        for (int i = 0, k = n; i < 2 * n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j < k - 1 ? " " : "*");
            }

            // i가 n-1보다 작으면 k 감소, 그렇지 않으면 k 증가
            if (i < n - 1) {
                k--;
            } else {
                k++;
            }

            // 줄 바꿈
            System.out.println();
        }

        // 스캐너 닫기
        sc.close();
    }
}
