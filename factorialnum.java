
import java.util.Scanner;

public class factorialnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i=1;
        int fact=1;
        if(n==0){
            System.out.println("1");
        }else{
            while(i<=n){
            fact=fact*i;
            i++;
            }
            System.out.println(fact);
        }
        
        
    }
}
