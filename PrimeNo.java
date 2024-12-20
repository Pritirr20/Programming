public class PrimeNo {
    public static void main(String[] args) {
        int num=7, count=0;
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                count++;
            }
            
        }
        if(count==0){
            System.out.println("Prime no");

        }else if(num==1){
            System.out.println("Not Prime no");
        }

    }
}
