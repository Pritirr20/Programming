// The sumation  of each digit factorial of no is equals to the  given no is know as Strong no;
public class StrongNo {
    public static void main(String[] args) {
        int num = 145, sum = 0;
        int temp = num;
        while (num > 0) {
            int re = num % 10;
            for (int i = 1; i <= re / 2; i++) {
                sum = sum + i;
            }
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Strong no" + temp);

        } else {
            System.out.println("Not a Strong no" + temp);
        }

    }
}
