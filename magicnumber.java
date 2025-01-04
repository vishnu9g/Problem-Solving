import java.util.Scanner;
public class magicnumber {
    public static void main(String[] args) {
        int magicnumber=243;
        Scanner sc = new Scanner(System.in);
        int guess=0;
        while(guess!=magicnumber){
            System.out.println("Enter a Number you Guessed:");
            guess=sc.nextInt();
          
            if(guess>magicnumber){
                System.out.println("Too High");
            }
            else if(guess<magicnumber){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Congrats!You Got it.");
            }

        }
            
        }

    }
 
