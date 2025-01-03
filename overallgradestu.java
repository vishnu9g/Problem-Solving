
import java.util.Scanner;

public class overallgradestu {
    public static void main(String[] args) {
        System.out.println("Enter Mark:");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        char Grade =
        (marks >= 90) ? 'A' :
        (marks >= 80) ? 'B' :
        (marks >= 70) ? 'C' :
        (marks >= 60) ? 'D' : 'F';
        System.out.println(Grade);
    }
    
}
