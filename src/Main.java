public class Main {
    public static void main(String[] args) {
        printMessage("Hello World!");
        printSum(5, 5);
    }

    private static void printSum(int i, int d) {
        System.out.println(String.valueOf(i+d));
    }

    private static void printMessage(String s) {
        System.out.println(s);
    }
}