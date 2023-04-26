public class Question12 {
    public static void main(String[] args) {
        short s1 = 1;
        short s2 = 2;

        int i1 = 3;
        int i2 = 4;

        // Q1
        short result1 = (short) (s1 + s2);

        // Q2
        int result2 = i1 + i2;
    }
}

//short result = s1 + s2;에서 결과를 short로 형변환해야합니다.
// 왜냐하면 short끼리 더하면 자동으로 int로 변환되기 때문입니다.
// 이를 (short) (s1 + s2)로 수정했습니다.
//두 개의 변수에 동일한 이름(result)을 사용할 수 없습니다.
// 따라서 결과 변수 이름을 변경했습니다.
