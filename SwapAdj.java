// Swap adjcent element from Array

import java.util.Arrays;

public class SwapAdj {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int i = 0, j = 1;
        int res[]=new int[arr.length];
        while ( j < arr.length) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            res[i]=arr[i];
            res[j]=arr[j];
            i+=2;
            j+=2;

        }
        System.out.println(Arrays.toString(arr));
    }
}
