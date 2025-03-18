package recursive;

public class RecursiveBasic {

    public static void recursive(int n) {
        if (n == 0) return;
        recursive(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        int result = n * factorial(n - 1);
        return result;
    }

    public static void main(String[] args) {
//        recursive(3);
        int factorial = factorial(5);
        System.out.println("factorial = " + factorial);

    }

}
