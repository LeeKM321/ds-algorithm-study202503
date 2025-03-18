package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution1 {

    static int[] dis = {1, -1, 5}; // 이동할 수 있는 거리
    static int[] check; // 방문 체크 배열
    static Queue<Integer> queue = new ArrayDeque<>();

    private static void BFS(int s, int e) {
        check = new int[10001]; // 0번 제끼고, 범위가 1 ~ 10000까지라서.
        check[s] = 1; // 시작점 체크
        queue.offer(s); // 시작점 큐에 넣자.
        int L = 0; // 레벨 -> 점프 횟수

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int curr = queue.poll();
                for (int j = 0; j < dis.length; j++) {
                    int next = curr + dis[j];
                    if (next == e) { // 다음으로 갈 수 있는 곳이 송아지라면
                        System.out.println(L + 1); // 현재 레벨 + 1 출력하고 끝!
                        return;
                    }
                    // check 배열 확인해서 이미 갔던 곳은 다시 방문하지 않도록 제어.
                    if (next >= 1 && next <= 10000 && check[next] == 0) {
                        check[next] = 1;
                        queue.offer(next);
                    }
                }
            }
            L++;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        BFS(S, E);


    }



}
