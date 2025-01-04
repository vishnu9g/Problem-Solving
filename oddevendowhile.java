public class oddevendowhile {
    public static void main(String[] args) {
        int i =1;
        int odd=0;
        int even=0;
        do{
            if(i%2==0){
                even+=i;
             }
            else{
                odd+=i;
             }i++;

        }while(i<=50);
        System.out.println("Odd Sum:"+ odd+"\n"+"Even Sum:"+even);
    }
    
}
