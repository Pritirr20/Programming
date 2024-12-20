// WAJP to identify mini no from given no
class MiniNo {
	public static void main(String[] args) {
		int num = 451263;

		System.out.println("No of digits are :" + Find(num));
	}

	public static int Find(int n1) {
		int small = 9;
		while (n1 > 0) {
			int temp = n1 % 10;
			if (temp < small) {
				small = temp;
			}
			n1 = n1 / 10;
		}
		return small;

	}

}
