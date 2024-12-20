// print pair of arrat whose sumis equal to n

import java.util.Scanner;

public class PairElements {
    public static void main(String[] args) {       Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the sum value");
        int num = s1.nextInt();
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " " + arr[j]);

                }
            }
        }
    }
}
