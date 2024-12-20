// WAJP to reverse the given no 
class Reverse 
{
	public static void main(String[] args) 
	{
		int num =123  ,temp=0;

		while(num>0){
		int re=num%10;
		temp = (temp*10)+re;
		num=num/10;
		}
		num=num/10;
		System.out.println(temp);
	}
}
