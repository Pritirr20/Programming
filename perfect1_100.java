public class perfect1_100 {
    public static void main(String[] args) {
        int sum=0;
        for(int num=1;num<=100;num++){
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum=sum+i;
                }

            }
            if(num==sum){
                System.out.println("perfect no "+num);

            }
            sum=0;

        }
    }
}
