// WAJP TO MARGE TWO GIVEN ARRAYS

import java.util.Arrays;

public class Marge {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 6, 7, 8 };
        int size = arr1.length + arr2.length;
        int index=0;
        int arr_temp[] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            
            arr_temp[index] = arr1[i];
            index++;

        }
        for (int j = 0; j < arr2.length; j++) {
            arr_temp[index] = arr2[j];
            index++;
        }
        System.out.println(Arrays.toString(arr_temp));
    }
}
