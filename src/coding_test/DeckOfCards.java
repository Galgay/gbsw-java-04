package coding_test;

public class DeckOfCards {

    public static void main(String[] args) {
        System.out.println(solution2(13, 17));
    }
    public static int solution2(int left, int right) {
        int answer = 0;

        // left ~ right까지 순회
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j=1; j<=i; i++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;

        for (String word : goal) {
            if (i < cards1.length && cards1[i].equals(word)) {
                i++;
            } else if (j < cards2.length && cards2[j].equals(word)) {
                j++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}


