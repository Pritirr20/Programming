class NOS1 
{
	
	public static void main(String[] args) {
		int num=214315 ;
		System.out.println("Last digit is :"+ getLastNO(num));
	}

	public static int getLastNO(int n){
	int re=0;
    re=n%10;
	return re;
	}

}

