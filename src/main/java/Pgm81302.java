import java.util.*;

public class Pgm81302 {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            int searchFlag = 1;

            for (int j = 0; j < places[i].length; j++) {
                for (int k = 0; k < places[i].length; k++) {
                    if (places[i][j].charAt(k) == 'P') {
                        boolean result = bfs(places[i], j, k);
                        if (result == false) {
                            searchFlag = 0;
                        }
                    }
                }
            }
            answer[i] = searchFlag;
        }

        return answer;
    }

    private static boolean bfs(String[] place, int x, int y) {
        int d = 0;
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0,0,-1,1};
        boolean[][] visited = new boolean[place.length][place.length];
        visited[x][y] = true;

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] {x, y, d});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for(int i =0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                int nd = current[2] + 1;

                if (nx < 0 || ny < 0 || nx >= place.length || ny >= place.length) continue;
                if (visited[nx][ny] || nd > 2) continue;

                visited[nx][ny] = true;

                if (place[nx].charAt(ny) == 'X') continue;
                else if (place[nx].charAt(ny) == 'P') {
                    if (nd <= 2)
                        return false;
                }
                else if (place[nx].charAt(ny) == 'O') {
                    if (nd < 2)
                        queue.offer(new int[] {nx, ny, nd});
                }
            }
        }
        return true;
    }
}
