public class palindromenum {
    public static void main(String[] args) {
        int num = 1234321;
        int b = num;
        int rev = 0;
        int rem = 0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==b){
            System.out.println("Given number is Palindrome");
        }
        else{
            System.out.print("Given number is Not a Palindrome");
        }
    }
    
}
