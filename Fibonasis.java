public class Fibonasis {
    public static void main(String[] args) {
        int a = 0, b = 1, num = 5;
        System.out.print(a);
        System.out.println(b);
        for (int i = 1; i <= num; i++) {
            a = b;
            b = a + b;
            System.out.print(a);
            System.out.println(b);
        }

    }
}
