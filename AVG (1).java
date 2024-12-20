public class AVG {
    public static void main(String[] args) {
        int arrElements[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Avg of array element is : " + avgSum(arrElements));
    }

    public static int avgSum(int[] n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                sum = sum + n[i];
                count++;

            }

        }
        return sum / count;
    }
}
