package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 왕자 수
        int K = Integer.parseInt(st.nextToken()); // K번째 왕자는 나가야 한다.

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            // K번째 이전 왕자들은 다시 큐 뒤로가서 줄서자
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            queue.poll(); // K번째는 나가라!
        }

        System.out.println(queue.poll());

        br.close();

    }

}
