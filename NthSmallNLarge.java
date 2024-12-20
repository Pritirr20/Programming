import java.util.Arrays;
import java.util.Scanner;

public class NthSmallNLarge {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the nth number");
        int nth = s1.nextInt();
        int arr[] = { 12, 23, 3, 4, 16, 74, 78, 56 };
        Arrays.sort(arr);
        System.out.println(nth + "Smmallest no is :" + arr[nth - 1]);
        System.out.println(nth + "Smmallest no is :" + arr[arr.length - nth]);

    }
}
