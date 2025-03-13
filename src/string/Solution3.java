package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while(left < right) {
            if (!Character.isAlphabetic(arr[left])) left++;
            else if (!Character.isAlphabetic(arr[right])) right--;
            else {
                // left, right가 둘 다 특수문자가 아니라면
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; right--;
            }
        }

        String newStr = String.valueOf(arr);
        System.out.println(newStr);

        sc.close();

    }
}
