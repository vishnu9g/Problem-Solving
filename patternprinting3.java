public class patternprinting3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ //row
            for(int space=1;space<=5-i;space++){ //space
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){ //column
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}