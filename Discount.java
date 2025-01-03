import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Price = sc.nextInt();
        boolean Membership = sc.nextBoolean();
        if(Price>=500){
            if(Membership==true){
            double Amount = Price*0.5;
                System.out.println("50% Discount Applicable"+" "+ Amount);
            }
            else{
                double Amount2 = Price*0.8;
                System.out.println("20% Discount Applicable"+" "+ Amount2);

            }
        }
        else
        {
            System.out.println("Discount Not Applicable");

        }        
    }
    
}
