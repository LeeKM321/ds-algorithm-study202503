package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c); // 여는 괄호를 스택에 넣음.
            } else if (c == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) { // 스택이 비어있다면 최종 결과에 포함.
                    sb.append(c);
                }
            }
        }

        System.out.println(sb);

        br.close();

    }

}








