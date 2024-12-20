public class Factorial {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                System.out.println(i + " is factorial of " + num);

            } else {
                System.out.println(i + " is not factorial of " + num);
            }

        }
        System.out.println(num + " is factorial of " + num);
    }
}
