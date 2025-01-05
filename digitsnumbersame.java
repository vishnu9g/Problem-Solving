public class digitsnumbersame {
    public static void main(String[] args) {
        int num = 2341;
        int rem=0;
        int firstnum=num%10;
        boolean ans=true;
        while(num>0)
        {
            rem=num%10;
            if(rem!=firstnum)
            {
             ans=false;
             break;
            }
            num=num/10;
        }
        System.out.println(ans);
    }
    
}
