import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        n = Integer.parseInt(br.readLine());
        int[] inputNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            inputNumbers[i] = Integer.parseInt(br.readLine());
        }

        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();


        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] > 1) {
                positives.add(inputNumbers[i]);
            }
            else if (inputNumbers[i] < 1 ) {
                negatives.add(inputNumbers[i]);
            }
            else ones.add(inputNumbers[i]);
        }

        Collections.sort(positives, Collections.reverseOrder());
        Collections.sort(negatives);

        int answer = ones.size();

        int i =0;
        while (i < positives.size()) {
            if (positives.size() - i == 1) {
                answer += positives.get(i);
                break;
            }
            else {
                answer += positives.get(i) * positives.get(i+1);
                i += 2;
            }
        }
        int j = 0;
        while (j<negatives.size()) {
            if (negatives.size() - j == 1) {
                answer += negatives.get(j);
                break;
            }
            else {
                answer += negatives.get(j) * negatives.get(j+1);
                j += 2;
            }
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
