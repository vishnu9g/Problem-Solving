
import java.util.Scanner;

public class povenegvnum {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        if(Num>0){
            System.out.println("Number is Positive!");
        }
        else if(Num<0){
            System.out.println("Number is Negative!");
        }
        else{
            System.out.println("The Given Number is Zero");
        }
    }
    
}
