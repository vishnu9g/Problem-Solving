public class harshadnumber {
    public static void main(String []args){
        int num = 40;
        int a=num;
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
        if(a%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }

        }
    }
    

