import java.util.Scanner;

class EvenOdd {
	public static void main(String[] args) {

		System.out.println("Enter No");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		s1.close();
	}
}
