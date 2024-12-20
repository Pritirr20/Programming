public class SunnyNo {
    public static void main(String[] args) {
        int num=15 , square=0;
        int res=num+1;
        for(int i=1;i<=num;i++){
            if(i*i==num){
                res=i*i;
                square=1;
                break;

            }
        }
        if(num==res){
            System.out.println("Sunny no");

        }else{
            System.out.println("Not Sunny no");
        }
    }
}
