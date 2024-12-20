//WAJP to identiy avg of digits 
// WAJP to indentify the given no is +ve or -ve 

class AVG
{
	
	public static void main(String[] args) {
		int n=21435;
		System.out.println("AVG is :"+Avg(n));
	}
	public static int Avg(int num){
		int sum=0 , Count=0 ;
		int res=0;
		while(num>0){
			sum = sum+ (num%10);
			Count++;
			num=num/10;
			
			}
		res=sum/Count;
		return res;
	}
	

}


  


