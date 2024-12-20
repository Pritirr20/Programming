class HoloTriangle 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1; i<=n;i++){
			for(int j=1; j<n+i;j++){
				if ( i==n ||j-i==n-1|| i+j==n+1)
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
