class PrintName
{
	public static void main(String[] args) throws Exception {
		int n=5  ;
		for(int i=1; i<=n;i++){
			for(int j=1; j<=n;j++){
				if (i==1|| j==1 || i==n/2+1 || i==2 && j==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}  
				Thread.sleep(150);
			}
			System.out.print("  ");
			for(int j=1; j<=n;j++){
				if (i==1|| j==1 || i==n/2+1 || i==2 && j==n || i==n && j==n-1 || i== n-1 && j==3){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}     
				Thread.sleep(150);
			}
			System.out.print("  ");
			for(int j=1; j<=n;j++){
				if (i==1||i==n || j==n/2+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}   
				Thread.sleep(150);
			}
			System.out.print("  ");
			for(int j=1; j<=n;j++){
				if (i==1 || j==n/2+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}      
				Thread.sleep(150);
			}
			System.out.print("  ");
			for(int j=1; j<=n;j++){
				if (i==1||i==n || j==n/2+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}     
				Thread.sleep(150);
			}
			System.out.println();
		}
	}
}
