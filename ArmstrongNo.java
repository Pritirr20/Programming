public class ArmstrongNo {
    public static void main(String[] args) {
        int num = 371, sum = 0, re = 0;
        int temp = num;

        while (num > 0) {
            re = num % 10;
            sum = sum + (re * re * re);
            num = num / 10;

        }
        if (temp == sum) {
            System.out.println("Armstrong no");

        } else {
            System.out.println("Not ");
        }
    }

}
