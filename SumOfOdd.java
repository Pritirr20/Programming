import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = s1.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }
        System.out.println("Given array is " + "[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Sum of Odd elements are :" + sum);

    }
}
