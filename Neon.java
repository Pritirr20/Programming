public class Neon {
    public static void main(String[] args) {
        int num = 9, sum = 0;
        int squareRoot = num * num;
        while (squareRoot > 0) {
            int re = squareRoot % 10;
            sum = sum + re;
            squareRoot = squareRoot / 10;

        }
        if (sum == num) {
            System.out.println("Neon no " + num);
        } else {
            System.out.println("not Neon no"+num);
        }

    }
}
