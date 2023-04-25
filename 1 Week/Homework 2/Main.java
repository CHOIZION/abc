import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 키보드 입력을 처리하기 위한 Scanner 객체 생성
        Scanner input = new Scanner(System.in);

        // 사용자로부터 문자열 형태의 두 정수를 입력받음
        String a = input.next();
        String b = input.next();

        // 두 정수 중 긴 정수의 길이를 구함
        int maxLen = Math.max(a.length(), b.length());

        // 두 정수의 자릿수를 저장할 배열 생성
        int aL[] = new int[maxLen + 1];
        int bL[] = new int[maxLen + 1];

        // 문자열 a의 각 자릿수를 배열 aL에 저장
        for (int i = a.length() - 1, idx = 0; i >= 0; i--, idx++) {
            aL[idx] = a.charAt(i) - '0';
        }

        // 문자열 b의 각 자릿수를 배열 bL에 저장
        for (int i = b.length() - 1, idx = 0; i >= 0; i--, idx++) {
            bL[idx] = b.charAt(i) - '0';
        }

        // 두 정수의 합을 계산
        for (int i = 0; i < maxLen; i++) {
            aL[i + 1] += (aL[i] + bL[i]) / 10; // 각 자릿수 덧셈 중 10을 넘으면 십의자리는 다음 덧셈할 때 더해서 같이 계산
            aL[i] = (aL[i] + bL[i]) % 10; // 일의자리만 해당 자릿수의 결과값으로 남긴다
        }

        // 마지막 자릿수 덧셈에서 10이 넘지 않아 마지막 배열에 0이 저장된 경우 출력하지 않음
        if (aL[maxLen] != 0)
            System.out.print(aL[maxLen]);

        // 계산된 두 정수의 합을 출력
        for (int i = maxLen - 1; i >= 0; i--)
            System.out.print(aL[i]);
    }
}
