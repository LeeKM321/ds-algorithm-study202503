package sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {42, 32, 24, 60, 15};

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            // 배열 중 가장 작은 값 탐색
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

    }

}
