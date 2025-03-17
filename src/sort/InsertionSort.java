package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {42, 32, 24, 60, 15};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            // j가 -1이 되면 반복문 종료 && 기준으로 삼은 값이 앞에 값보다 크면 돌아갈 필요 없음!
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

}
















