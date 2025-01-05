public class armstrongnumberdm {
    public static void main(String[] args) {
        int num =153 ;
        int a=num;
        int rem=0;
        double res=0;
        while(num>0)
        {
            rem=num%10;
            res=res+Math.pow(rem,3);
            num=num/10;
        }
        if(res==a)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }

    }
    
}
