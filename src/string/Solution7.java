package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) throws IOException {

        //KKHSSSSSSSE
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();*/

        String answer = "";
        str = str + " ";
        int cnt = 1;
        // KKHSSSSSSSE
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += cnt;
                cnt = 1;
            }
        }

        System.out.println(answer);


        br.close();

    }
}