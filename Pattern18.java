class Pattern18 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=n; i>=1;i--){
			for(int j=1; j<n+i;j++){
				if (i+j>n)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}