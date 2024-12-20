// WAJP to identify mini no from given no 
	class  MaxNo1{
	public static void main(String[] args) 
	{
		int num=451263;
		
		System.out.println("No of digits are :"+Find(num));
	}
	public static int Find(int n1){
		int digit =0;
		while(n1>0){
		int temp=n1%10;
		if(temp>digit){
			digit=temp;
		}
			n1=n1/10;
		} 
		return 	digit;
		
	}

}
