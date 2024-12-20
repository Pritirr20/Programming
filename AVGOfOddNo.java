//WAJP to identiy avg of digits 
// WAJP to indentify the given no is +ve or -ve 

class AVGOfOddNo
{
	
	public static void main(String[] args) {
		int n=451263   ;
		System.out.println("AVG is :"+Avg(n));
	}
	public static int Avg(int num){
		int sum=0 , Count=0 ;
		int res=0;
		while(num>0){
			int re=num%10;
			if(re%2!=0){
			sum = sum+ re;
			Count++;
			res=sum/Count;
			}
		 num=num/10;
		 } return res;
	

}
}


  


