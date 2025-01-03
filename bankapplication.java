
import java.util.Scanner;

public class bankapplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your");
        String Action = sc.nextLine();
        int Balance = 10000;
        switch(Action){

            case "Withdraw":
            System.out.println("Enter amount to be Withdraw:");
            int Amount=sc.nextInt();
            if(Amount<=Balance){
                Balance-=Amount;
                System.out.println("You Can Collect your Cash");
                System.out.println("Your Current Bank balance: "+Balance);
            }
            else{
                System.out.println("Enter Less than your Current Bank Balance");
            }
            break;

            case "Deposit":
            System.out.println("Enter amount to Deposit:");
            int amount=sc.nextInt();
            Balance+=amount;
            System.out.println("Your Current Balance is : "+""+Balance);
            break;

            case "Balance":
            System.out.println("Your Current Balance is : "+""+Balance);
            break;

            default:
            System.out.println("Service is not available");
        }
        
    }
    
}
