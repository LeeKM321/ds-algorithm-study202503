package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution11659 {

    public static void main(String[] args) throws IOException {
        /*
        입력부터 제대로 처리하자!
        for (숫자 개수만큼 반복 -> N) {
            구간합 배열 생성하기 (S[i] = S[i-1] + A[i])
        }

        for (구간합 구하는 개수만큼 반복 -> M) {
            구간합 구하는 공식:
            S[y] - S[x-1], x가 0일 경우 S[0]
        }

        5 3
        5 4 3 2 1
        1 3
        2 4
        5 5
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 5
        int M = Integer.parseInt(st.nextToken()); // 3

        int[] S = new int[N + 1];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        // 구간 합 배열 만들기
        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st3.nextToken());
            int y = Integer.parseInt(st3.nextToken());

            sb.append(S[y] - S[x-1] + "\n");
        }

        System.out.println(sb);

        br.close();


    }
}









