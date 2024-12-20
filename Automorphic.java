public class Automorphic {
    public static void main(String[] args) {
        int num = 25;
        int num1 = num * num;
        boolean res = true;
        while (num1 > 0) {
            if (num % 10 == num1 % 10) {
                num = num % 10;
                num1 = num1 / 10;

            } else {
                res = false;
                break;
            }

        }

        if (res == true) {
            System.out.println(num1 + " is Automorphic no");
        } else {
            System.out.println(num + " Not a Automorphic no ");
        }

    }

}
