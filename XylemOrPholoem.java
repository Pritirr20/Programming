public class XylemOrPholoem {
    public static void main(String[] args) {
        int num=1234;
        int OS=num%10;
        int IS=0;
        num=num/10;
        while (num>9) {
            int re=num%10;
            IS=IS+re;
            num=num/10;   
        }
        OS=OS+num;
        if(IS==OS){
            System.out.println("Xylem no");
        }else{
            System.out.println("Pholoem no");
        }

    }
}
