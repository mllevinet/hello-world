public class Main {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }

    public static int add(int i, int j) {
        int k = i + j;
        k = k + 1;
        return k;
    }

    public static String getMessage(String[] s, int i) {
        return "hello";
    }
}