import java.util.Scanner; // Scanner 클래스를 import 함

public class Main {
    public static void main(String[] args) {
        // 키보드 입력을 처리하기 위한 Scanner 객체 생성
        Scanner input = new Scanner(System.in);

        // 사용자로부터 정수를 입력받아 a 변수에 저장
        int a = input.nextInt();

        // 사용자로부터 정수를 입력받아 b 변수에 저장
        int b = input.nextInt();

        // a와 b의 합을 출력
        System.out.println(a + b);

        // a에서 b를 뺀 차를 출력
        System.out.println(a - b);

        // a와 b의 곱을 출력
        System.out.println(a * b);

        // a를 b로 나눈 몫을 출력 (정수 나눗셈)
        System.out.println(a / b);

        // a를 b로 나눈 나머지를 출력
        System.out.println(a % b);
    }
}
