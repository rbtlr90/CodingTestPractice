import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Pgm92342 pgm92342 = new Pgm92342();
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(pgm92342.solution(n, info)));
    }
}
