import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 읽기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 양수의 개수를 저장할 변수 초기화
        int cnt = 0;

        // 사용자가 입력한 정수가 있는 동안 계속 실행
        while (sc.hasNextInt()) {
            // 정수를 읽음
            int a = sc.nextInt();

            // 읽은 정수가 양수인 경우 카운트 증가
            if (a > 0) {
                cnt++;
            }
        }

        // 양수의 개수 출력
        System.out.println(cnt);
    }
}
