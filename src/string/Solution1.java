package string;

import java.util.Scanner;

public class Solution1 {



    public static void main(String[] args) {
        /*
        입력: Computercooler
             c

         출력: 2
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String c = sc.next();

        str = str.toUpperCase();
        char c2 = c.toUpperCase().charAt(0);

        int count = 0;
        for (char c1 : str.toCharArray()) {
            if (c1 == c2) count++;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == c2) count++;
//        }

        System.out.println(count);

        sc.close();

    }

}
