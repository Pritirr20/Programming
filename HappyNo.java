public class HappyNo {

    public static void main(String[] args) {
        int num = 82;
        int res = num;
        while (res != 1 && res != 4) {
            res = squareRoot(res);
        }
        if (res == 1) {
            System.out.println(num + " is a Happy no " + res);

        } else {
            System.out.println(num + " Not a Happy no " + res);
        }
    }

    public static int squareRoot(int num) {
        int re = 0, sum = 0;
        while (num > 0) {
            re = num % 10;
            sum = sum + re * re;
            num = num / 10;

        }
        return sum;

    }
}
