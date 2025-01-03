public class greatestofthree {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int MaxNum = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(MaxNum);
    }
    
}
