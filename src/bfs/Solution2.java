package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution2 {

    static int n, m, answer = 0;
    static List<List<Integer>> graph;
    static int[] ch, dis;

    static void BFS(int v) {
        ch[v] = 1; // 노드 방문 체크
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int nv : graph.get(curr)) {
                if (ch[nv] == 0) { // 방문한 적이 없는 노드라면
                    ch[nv] = 1; // 방문 체크 하고
                    queue.offer(nv); // 인접 노드를 큐에다가 넣기
                    dis[nv] = dis[curr] + 1; // 현재 노드에서 인접 노드까지의 거리를 누적해서 세팅
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ch = new int[N + 1]; // 방문 여부를 확인하는 배열
        dis = new int[N + 1]; // 1번 노드로부터 각 노드까지의 최단 거리를 저장하는 배열
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            // 노드의 개수만큼 리스트 생성해서 추가
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // graph[a][b] = 1;
            graph.get(a).add(b);
        }

        BFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(i + ":" + dis[i]);
        }

        br.close();

    }

}
