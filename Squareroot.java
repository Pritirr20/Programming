// WAJP To identify the squareroot of given no.
public class Squareroot {
    public static void main(String[] args) {
        int num = 121, squartRoot = 0, res = 1;
        for (int i = 1; res <= num / 2; i++) {
            res = i * i;
            if (i * i == num) {
                squartRoot = i;
                break;
            }

        }
        if (num == res) {
            System.out.println(res + " is the SquareRoot  of" + num);

        } else {
            System.out.println(res + " is the SquareRoot  of" + num);
        }
    }
}
