public class patternprinting4 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int spaces=2;spaces<=i;spaces++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
