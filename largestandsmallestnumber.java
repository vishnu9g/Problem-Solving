
import java.util.Scanner;

public class largestandsmallestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int max=0;
        int min=0;
        char choice;

        do { 
            System.out.println("Enter Number:");
            num=sc.nextInt();
            if(num>max){
                System.out.println(max);
            }
            if(num<min){
               System.out.println(min); 
            }
            System.out.println("Enter Choice:");
            choice=sc.next().charAt(0);
        }while (choice=='s'||choice=='S');
        System.out.println("Maximum num: "+max);
        System.out.println("Minimum num: "+min);
    }

}

    