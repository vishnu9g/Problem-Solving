import java.util.Scanner;
public class numdiv2awa3 {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        if(Num%2==0){
            if(Num%3==0){
                System.out.println("Number is Divisible by Both 2 and 3");
            }
        }
        else{
            System.out.println("Number is not Divisible by Both 2 and 3");
        }
    }
    
}
