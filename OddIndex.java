import java.util.Scanner;

public class OddIndex {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = s1.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + "th elemnt of an array : ");
            arr[i] = s1.nextInt();
        }
        System.out.print("Given array's odd index elements are  " );
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
