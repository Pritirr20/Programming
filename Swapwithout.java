public class Swapwithout {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap  a and b are " + a + " " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap a and b are  " + a + " " + b);

    }
}
