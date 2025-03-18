package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Solution3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 13 15 34 23 45 65 33 11 26 42
        // 내림차 TreeSet 생성 -> 중복방지, 내림차 정렬이 필요해서
        Set<Integer> tSet = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    tSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        // K번째 큰 값 찾기
        int count = 0;
        for (int i : tSet) {
            count++;
            if (count == K) {
                System.out.println(i);
                break;
            }
        }

        br.close();

    }

}









