import java.util.Arrays;

public class SwapOddHalf {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};
        int i = 0, j = (arr.length/2)+1;
        int res[] = new int[arr.length];
        while (j < arr.length/2){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            res[i] = arr[i];
            res[j] = arr[j];
            i++;
            j++;
        }
        j=(arr.length/2)+1;
        int temp=arr[arr.length/2];
        while (j < arr.length) {
            arr[j-1]=arr[j];
            j++;
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
