public class UpperLowercase {
    public static void main(String[] args) {
        char alphabet ='A';
        if(alphabet>='a' && alphabet<='z'){
            System.out.print("Given Character is Lower Case");
        }
        else if(alphabet>='A' && alphabet<='Z'){
            System.out.print("Given Character is Upper Case");
        }
        else{
            System.out.print("Given Character is Digit");
        }

    }
    
}
