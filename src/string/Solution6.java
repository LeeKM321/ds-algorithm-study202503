package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution6 {

    public static void main(String[] args) throws IOException {
        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String s = arr[0];
        char t = arr[1].charAt(0);
        */

        // teachermode e
        // Scanner는 정규표현식을 처리하는 등 기능이 많아서, 추가적인 연산이 필요해서
        // 입력이 자주 발생하면 속도가 저하됩니다.
        // BufferedReader는 단순히 입력값 자체를 읽어오는 거라 연산이 필요 없어 속도가 빠릅니다.
        // readLine() 메서드를 통해 한 줄씩 텍스트를 읽어 옵니다.
        // 만약 한 줄에 종류가 다른 입력값이 여럿 존재한다면, StringTokenizer를 통해서
        // 구분자를 통해 각 입력값을 토큰화 해서 가져올 수 있습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = st.nextToken();
        char t = st.nextToken().charAt(0);


        int[] result = new int[s.length()]; // 거리를 숫자로 담을 배열
        int p = 100; // 거리 비교를 위해 선언한 변수 (0으로 초기화하면 안됨! 0은 찾고자 하는 문자와 같다는 의미)

        // 왼쪽에서 오른쪽으로 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0; // 기준 문자를 만났다면 거리는 0
            } else {
                p++; // 기준 문자가 아니라면 이전 문자와의 거리 + 1
            }
            result[i] = p;
        }

        // 오른쪽에서 왼쪽으로 거리 계산
        p = 100;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0; // 기준 문자를 만났다면 거리는 0
            } else {
                p++; // 기준 문자가 아니라면 이전 문자와의 거리 + 1
            }
            // 위에서 계산한 결과와 비교해서 더 작은 값으로 할당하기
            result[i] = Math.min(result[i], p);
        }

        // 결과 출력
        for (int i : result) {
            System.out.print(i + " ");
        }

        br.close();
    }
}










