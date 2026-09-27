package programmers;

import java.util.Arrays;
import java.util.stream.LongStream;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }

    public static long[] solution(int x, int n) {
//        long[] result = new long[(int) n];
//        Arrays.setAll(result, i -> (long) (i + 1) * x);
//
//        return result;

//        return LongStream.range(1, n + 1).map(num -> num * x).toArray();

        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
//        for (int i = 1; i <= n; i++) {
//            answer[i - 1] = (long) x * i;
//        }
//
//        return answer;
    }
}
