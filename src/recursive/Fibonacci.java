package recursive;

import java.util.Arrays;

public class Fibonacci {

    static long[] fibo;

    public static long fibonacci(int n) {
        // 메모이제이션 (dp 기법 중 하나)
        // 이미 배열에 값을 적어놨다면, 계속해서 재귀함수를 호출할 필요가 없다!
        if (fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void conversionToBinary(int n) {
        // 10진수 n을 2진수로 변환하여 출력하는 로직을 작성하세요. (재귀)
        // 1 <= n <= 1000
        // 23 -> 10111
        if (n == 0) return;
        conversionToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {

        // 10 -> 1 1 2 3 5 8 13 21 34 55
//        int n = 100;
//        fibo = new long[n + 1];
//        long result = fibonacci(n);
//        System.out.println("result = " + result);
//        System.out.println(Arrays.toString(fibo));
        conversionToBinary(23);

    }

}
