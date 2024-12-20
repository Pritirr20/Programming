class  Insert{
    public static void main(string [] args ){
        int arr[]={10,20,30,40,50};
        int index=3;
        int ele=60;

        int temp=new int[arr.lenght+1];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.lenght;i++){
        temp[i]=arr[i-1];

        }
        for(int i=temp.lenght-1;i>index;i--){
            temp[i]=temp[i-1];
        }
        temp[index]=ele;
        arr=temp;
        System.out.println(Arrays.toString(arr));


    }
}