
//count no
class NOS3
{
	
	public static void main(String[] args) {
		int n=21431 ;
		System.out.println("No of digits are :"+count(n));
	}
    
	public static int count(int num){
		int count=0;
		while(num>0){
			count ++;
			num=num/10;
			}
		return count;
	}
	

}




