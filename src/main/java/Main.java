import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
//        Pgm92342 pgm92342 = new Pgm92342();
//        int n = 5;
//        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
//        System.out.println(Arrays.toString(pgm92342.solution(n, info)));
        Pgm43105 pgm43105 = new Pgm43105();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
//        System.out.println(Arrays.deepToString(triangle));
        System.out.println(pgm43105.solution(triangle));
    }
}
