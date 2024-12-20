import java.util.Arrays;

public class ZigzacMarge{
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 6, 7, 8 };
        int index = 0;  
        int arr_temp[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length && i < arr2.length; i++){
            arr_temp[index] = arr1[i];
            index++;
            arr_temp[index] = arr2[i];
            index++;
        }

        System.out.println(Arrays.toString(arr_temp));
    }
}
