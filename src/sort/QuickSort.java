package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        Arrays.sort(arr);

        quickSort(arr, 0, arr.length-1);

    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 파티션 분할 처리
            int pivotIndex = partition(arr, low, high);

            // 피봇 인덱스보다 작은 영역(왼쪽)의 정렬을 계속 반복해 주자.
            quickSort(arr, low, pivotIndex-1);

            // 피봇 인덱스보다 큰 영역(오른쪽)의 정렬을 반복해 주자.
            quickSort(arr, pivotIndex+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // 첫번째 요소를 피봇으로 선택
        int pivot = arr[low];

        // 작은 값 영역의 경계를 나타내는 변수
        int i = low;

        for (int j = low+1; j <= high; j++) {
            // 현재의 요소가 피봇보다 작다면
            if (arr[j] < pivot) {
                i++; // 작은 값 영역 오른쪽으로 확장

                // i가 가리키는 값과 현재 요소 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 피봇을 올바른 위치에 적용
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        System.out.println("분할 후의 상태: " + Arrays.toString(arr));
        System.out.println("피봇 위치: " + i + ", 피봇 값: " + arr[i]);

        return i; // 피봇 위치 반환
    }

}
