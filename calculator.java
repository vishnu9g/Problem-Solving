import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char Operator = sc.next().charAt(0);
        switch(Operator){
            case '+':
            int add=num1+num2;
            System.out.println(add);
            break;

            case '-':
            int sub=num1-num2;
            if (num1>num2){
                System.out.println("num1 is greatest"); 
            }
            System.out.println(sub);
            break;

            case '*':
            int mul=num1*num2;
            System.out.println(mul);
            break;

            case '/':
            int div=num1/num2;
            System.out.println(div);
            break;

            default:
            System.out.println("Enter Valid Statement");
        }
    }
}
