import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the No");
        int num = s1.nextInt();
        int  sum = 0;
        int temp = num;
        while (num > 0) {
            int re = num % 10;
            sum = (sum * 10) + re;
            num = num / 10;
        }
        num = num / 10;

        if (sum == temp) {
            System.out.println("Palindrom " + sum);
        } else {
            System.out.println("not a Palindrom " + sum);
        }
    }

}
