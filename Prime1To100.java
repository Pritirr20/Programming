public class Prime1To100 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i <=100; i++) {
            for (int j = 1; j <=i/2; j++) {
                if(i%j==0){
                    count++;
                    break;

                }
            }
            if(count==0){
                System.out.println("Prime no is "+count);
            }
            count=0;
            
        }
    }

}
