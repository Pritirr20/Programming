import java.util.Arrays;

public interface DublicateEle {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 3, 4 };
        int arr1[] = new int[arr.length];
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < index; j++) {
                if (arr[i] == arr1[j]) {
                    flag = true;
                    break;

                }
            }
            if (!flag) {
                arr1[index] = arr[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(arr));
        arr = Arrays.copyOf(arr1, index);
        System.out.println(Arrays.toString(arr));

    }
}
