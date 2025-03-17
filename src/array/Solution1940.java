package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1940 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2 7 4 1 5 3
        // 1 2 3 4 5 7
        Arrays.sort(arr);

        int start = 0, end = N-1, total = 0, count = 0;

        while (start < end) {
            total = arr[start] + arr[end];
            if (total < M) { // 합계가 갑옷을 만들기엔 부족!
                start++;
            } else if (total == M) { // 합계가 같은 경우!
                count++;
                start++;
                end--;
            } else { // 합계가 넘치는 경우!
                end--;
            }
        }

        System.out.println(count);

        br.close();
    }

}
