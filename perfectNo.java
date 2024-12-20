// Note :The sum of factors of given no, accept the given no itself shoul`````````````````````````d be equals to the given no is know as perfect no
public class perfectNo {
    public static void main(String[] args) {
        int num = 6, sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Given no"+num+ " is perfect no");
        } else {
            System.out.println("Given no is not perfect  no");
        }
    }
}
