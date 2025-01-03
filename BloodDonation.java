import java.util.Scanner;
public class BloodDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String BG1 = sc.nextLine();
        String BG2 = sc.nextLine();
        int Age = sc.nextInt();
        int Weight = sc.nextInt();

    if(Age>=18 && Weight>=45){
        if(BG1.equals(BG2)){
            System.out.println("You Can Donate Blood");
        }
        else
        {
            System.out.println("You Cannot Donate Blood");
        }  
    }
    }  
}
