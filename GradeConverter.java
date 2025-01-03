import java.util.Scanner;
public class GradeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>90){
            System.out.println("Grade O; Pass");
        }
        else if(a>80 && a<=90){
            System.out.println("Grade A; Pass");
        }
        else if(a>70 && a<=80){
            System.out.println("Grade B; Pass");
        }
        else if(a>=60 && a<=70){
            System.out.println("Grade C; Pass");
        }
        else{
            System.out.println("Fail");
        }      
    }
    
}
