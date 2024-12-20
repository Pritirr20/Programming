class  EvenSum
{
	public static void main(String[] args) 
	{
		int num=451263 ,sum=0;
		
		while(num>0){
			int re=num%10;
			if(re%2==0){
			sum=sum+ re;
			System.out.println("No of digits are :"+sum);
		    }
		num=num/10;
		}
	}
}
