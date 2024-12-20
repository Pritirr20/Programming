
//WAJP To identify the sum of ditits 
class SUMFun
{
	
	public static void main(String[] args) {
		int n=21431;
		System.out.println("No of digits are :"+Sum(n));
	}
    
	public static int Sum(int num){
		int sum=0;
		while(num>0){
			sum = sum+ (num%10);
			num=num/10;
			
			}
		return sum;
	}
	

}




