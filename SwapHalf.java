// 1st half of an array with 2nd half of the array

import java.util.Arrays;

public class SwapHalf {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int i = 0, j = arr.length/2;
        int res[] = new int[arr.length];
        while (i < arr.length / 2) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            res[i] = arr[i];
            res[j] = arr[j];
            i++;
            j++;

        }
        System.out.println(Arrays.toString(arr));

    }

}
