package recursive;

public class RecursiveBasic {

    public static void recursive(int n) {
        if (n == 0) return;
        recursive(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        recursive(3);
    }

}
