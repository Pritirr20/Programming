import java.util.Arrays;

public class MargeShort {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 2, 4, 6, 8 };
        int i = 0, j = 0, index = 0;
        int res[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                res[index] = arr1[i];
                i++;
            } else {
                res[index] = arr2[j];
                j++;
            }
            index++;
        }
        while (i < arr1.length) {
            res[index] = arr1[i];
            i++;
            index++;
        }
        while (j < arr2.length) {
            res[index] = arr2[j];
            j++;
            index++;
        }
        System.out.println(Arrays.toString(res));

    }
}
