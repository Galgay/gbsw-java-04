package programmers;

public class 콜라츠 {
    public static void main(String[] args) {

//        System.out.println(solution(12));
        System.out.println(solution(626331));
    }
    public static int solution(long num) {
        int count = 0;

        while (num != 1) {
            if (count >= 500) {
                return -1;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }

            System.out.println(num);
            count++;
        }
        return count;
    }
}
