package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        // BACBACCACCBDEDE
        for (char c : str.toCharArray()) {
//            getOrDefault는 key에 맵핑된 값을 가져오는데, 만약 key가 존재하지 않으면 지정한 기본값을 리턴.
//            map.getOrDefault(c, 0)
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char result = '\0';
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        System.out.println(result);

        br.close();

    }

}
