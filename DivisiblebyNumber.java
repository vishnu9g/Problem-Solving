public class DivisiblebyNumber {
    public static void main(String[] args) {
        int num=30;
        if(num%3==0 && num%5==0){
            System.out.println("Number is divisible by both");
        }
        else if (num%5==0){
            System.out.println("Number is divisible by 5");
        }
        else if (num%3==0){
            System.out.println("Number is divisible by 3");
        }
        else{
            System.out.println("Not Divisible by Both Numbers");
        }
        
    }
    
}
