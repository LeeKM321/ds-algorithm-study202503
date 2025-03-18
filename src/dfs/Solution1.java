package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {

    static int N;
    static int[] check;

    static void DFS(int L) {
        if (L == N + 1) { // 배열 끝까지 탐색이 완료된 경우
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                // check 배열에 원소를 사용할 때마다 해당 인덱스 자리에 1을 넣고 있다.
                // 1이 들어가 있는 인덱스만 append 해서 출력
                if (check[i] == 1) sb.append(i + " ");
            }
            // 공집합이 아니라면 부분집합을 출력해라.
            if (!sb.isEmpty()) System.out.println(sb);
        } else {
            check[L] = 1;
            DFS(L + 1); // lt

            check[L] = 0;
            DFS(L + 1); // rt
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        check = new int[N + 1];
        DFS(1);

        br.close();

    }

}
