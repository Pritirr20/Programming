class NOS2
{
	
	public static void main(String[] args) {
		NOS2 ob = new NOS2();
		int num=214315 ;
		System.out.println("Last digit is :"+ ob.removeLastNo(num));
	}

	public int removeLastNo(int n){
	return n/10;
	}

}

