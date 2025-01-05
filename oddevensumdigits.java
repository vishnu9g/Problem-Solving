public class oddevensumdigits {
    public static void main(String[] args) {
        int num=12345;
        int rem=0;
        int odd=0;
        int even=0;
        while(num>0){
            rem=num%10;
            if(rem%2==0){
                even=rem+even;
            }
            else{
                odd=rem+odd;
                
            }
            num=num/10;
        }
        System.out.println("Sum of Even No is : "+even);
        System.out.println("Sum of Odd No is : "+odd);
    }
    
}
