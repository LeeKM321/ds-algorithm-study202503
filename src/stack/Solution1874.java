package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int current = 1; // 스택에 넣을 현재 값.
        StringBuilder sb = new StringBuilder();

        boolean flag = true; // 수열을 표현할 수 있는가?

        for (int i = 0; i < N; i++) {
            int num = seq[i]; // 수열의 값을 순차적으로 가져옴.

            // 주어진 수열 값까지 스택에 값을 push
            while (current <= num) {
                stack.push(current);
                sb.append("+\n");
                current++;
            }

            // 스택에 마지막으로 넣은 값이 수열 값과 같다면 pop
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                flag = false;
                break; // 스택의 마지막 값이 수열과 일치하지 않음 -> 스택으로 표현할 수 없음!
            }
        }

        // 결과 출력
        if (flag) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }

        br.close();
    }

}
