import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pgm92342 {
    public int[] solution(int n, int[] info) {
        int[] answer = {};
//        int[] apeachMissIndexes = {};
        List<Integer> apeachMissIndexes = new ArrayList<>();
        for (int i = 0; i < info.length; i++) {
            if (info[i] == 0) {
                apeachMissIndexes.add(i);
            }
        }

        return answer;
    }
}
