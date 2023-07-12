import java.util.LinkedList;
import java.util.Queue;

public class Pgm118667 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;
        int caculateLimit = queue1.length * 4;

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            sum1 += queue1[i];
            sum2 += queue2[i];
        }

        long totalSum = sum1 + sum2;

        if (totalSum % 2 != 0) {
            return -1;
        }
        int currentCandidate;

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (answer == caculateLimit) return -1;
            if (sum1 == sum2) return answer;
            else if (sum1 > totalSum/2) {
                currentCandidate = q1.poll();
                sum1 -= currentCandidate;
                sum2 += currentCandidate;
                q2.add(currentCandidate);
                answer ++;
            } else {
                currentCandidate = q2.poll();
                sum2 -= currentCandidate;
                sum1 += currentCandidate;
                q1.add(currentCandidate);
                answer ++;
            }
        }

        return -1;
    }
}
