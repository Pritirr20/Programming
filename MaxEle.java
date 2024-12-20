public class MaxEle {
    public static void main(String[] args) {
        int arr[]={1,12,14,23,16,88};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println("Max element is : "+max);
    }
}
