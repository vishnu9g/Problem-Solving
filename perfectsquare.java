public class perfectsquare {
    public static void main(String[] args) {
        int num=21;
        int d=(int)Math.sqrt(num);
        if(d*d==num)
        {
            System.out.println(num+" is Perfect Square");
        }
        else
        {
            System.out.println(num+" is not a Perfect Square");
        }
    }
    
}
