package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        /*
        Stack 객체를 사용해도 되지만, ArrayDeque을 주로 많이 사용합니다.
        1. 상속 구조로 인한 오버헤드 발생
        2. 불필요한 동기화 방지
        3. 확장성 문제 (Vector는 배열이 가득차면 무조건 크기를 두배씩 늘림. ArrayDeque은 필요할 때마다 늘림)
         */
//        Stack<Character> stack = new Stack<>();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c); // 여는 괄호는 스택에 넣자.
            } else {
                // stack이 비었는데 pop을 하면 예외가 발생합니다.
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                // 닫는 괄호일 때는 스택에서 여는 괄호를 꺼냄.
                stack.pop();
            }
        }

        // 모든 처리가 완료된 후에 스택이 비어있지 않으면 올바른 괄호가 아니에요.
        // 올바른 괄호라면 짝이 맞기 때문에 스택이 비어 있어야 합니다!
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        br.close();

    }

}











