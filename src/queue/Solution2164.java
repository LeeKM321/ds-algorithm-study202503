package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 카드의 개수 N
        Queue<Integer> queue = new ArrayDeque<>();

        // 큐에다가 1부터 N까지 채우자.
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 카드가 큐에 1장 남을 때 까지 반복
        while (queue.size() > 1) {
            queue.poll(); // 첫장 버리세요
            queue.offer(queue.poll()); // 맨 앞장 카드 뽑아서 뒤에 붙이세요.
        }

        System.out.println(queue.poll());

        br.close();


    }

}












